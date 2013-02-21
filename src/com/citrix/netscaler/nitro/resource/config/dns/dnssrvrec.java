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

class dnssrvrec_response extends base_response
{
	public dnssrvrec[] dnssrvrec;
}
/**
* Configuration for server record resource.
*/

public class dnssrvrec extends base_resource
{
	private String domain;
	private String target;
	private Long priority;
	private Long weight;
	private Long port;
	private Long ttl;
	private String type;

	//------- Read only Parameter ---------;

	private String authtype;
	private Long __count;

	/**
	* <pre>
	* The domain name that is offering the services. The domain name			 includes the service offered and transport layer protocol, e.g.: _ftp._tcp.abc.com.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* The domain name that is offering the services. The domain name			 includes the service offered and transport layer protocol, e.g.: _ftp._tcp.abc.com.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* The target host that is hosting the specified service.
	* </pre>
	*/
	public void set_target(String target) throws Exception{
		this.target = target;
	}

	/**
	* <pre>
	* The target host that is hosting the specified service.
	* </pre>
	*/
	public String get_target() throws Exception {
		return this.target;
	}

	/**
	* <pre>
	* The target host priority. This helps in server selection by the client.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* The target host priority. This helps in server selection by the client.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* The target host priority. This helps in server selection by the client.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Weight for the target host. This helps in server selection by the client in case of same priority.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* Weight for the target host. This helps in server selection by the client in case of same priority.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* Weight for the target host. This helps in server selection by the client in case of same priority.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* Port on which the target host is listening for client requests.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_port(long port) throws Exception {
		this.port = new Long(port);
	}

	/**
	* <pre>
	* Port on which the target host is listening for client requests.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_port(Long port) throws Exception{
		this.port = port;
	}

	/**
	* <pre>
	* Port on which the target host is listening for client requests.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* The time to live, measured in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* The time to live, measured in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* The time to live, measured in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* SRV record type. The type can take 3 values:
ADNS -  If this is specified, all of the authoritative SRV records will be displayed.
PROXY - If this is specified, all of the proxy SRV records will be displayed.
ALL  -  If this is specified, all of the SRV records will be displayed.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* SRV record type. The type can take 3 values:
ADNS -  If this is specified, all of the authoritative SRV records will be displayed.
PROXY - If this is specified, all of the proxy SRV records will be displayed.
ALL  -  If this is specified, all of the SRV records will be displayed.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Record type.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public String get_authtype() throws Exception {
		return this.authtype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnssrvrec_response result = (dnssrvrec_response) service.get_payload_formatter().string_to_resource(dnssrvrec_response.class, response);
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
		return result.dnssrvrec;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.domain;
	}

	/**
	* Use this API to add dnssrvrec.
	*/
	public static base_response add(nitro_service client, dnssrvrec resource) throws Exception {
		dnssrvrec addresource = new dnssrvrec();
		addresource.domain = resource.domain;
		addresource.target = resource.target;
		addresource.priority = resource.priority;
		addresource.weight = resource.weight;
		addresource.port = resource.port;
		addresource.ttl = resource.ttl;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnssrvrec resources.
	*/
	public static base_responses add(nitro_service client, dnssrvrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnssrvrec addresources[] = new dnssrvrec[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnssrvrec();
				addresources[i].domain = resources[i].domain;
				addresources[i].target = resources[i].target;
				addresources[i].priority = resources[i].priority;
				addresources[i].weight = resources[i].weight;
				addresources[i].port = resources[i].port;
				addresources[i].ttl = resources[i].ttl;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnssrvrec of given name.
	*/
	public static base_response delete(nitro_service client, String domain) throws Exception {
		dnssrvrec deleteresource = new dnssrvrec();
		deleteresource.domain = domain;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnssrvrec.
	*/
	public static base_response delete(nitro_service client, dnssrvrec resource) throws Exception {
		dnssrvrec deleteresource = new dnssrvrec();
		deleteresource.domain = resource.domain;
		deleteresource.target = resource.target;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnssrvrec resources of given names.
	*/
	public static base_responses delete(nitro_service client, String domain[]) throws Exception {
		base_responses result = null;
		if (domain != null && domain.length > 0) {
			dnssrvrec deleteresources[] = new dnssrvrec[domain.length];
			for (int i=0;i<domain.length;i++){
				deleteresources[i] = new dnssrvrec();
				deleteresources[i].domain = domain[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnssrvrec resources.
	*/
	public static base_responses delete(nitro_service client, dnssrvrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnssrvrec deleteresources[] = new dnssrvrec[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnssrvrec();
				deleteresources[i].domain = resources[i].domain;
				deleteresources[i].target = resources[i].target;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update dnssrvrec.
	*/
	public static base_response update(nitro_service client, dnssrvrec resource) throws Exception {
		dnssrvrec updateresource = new dnssrvrec();
		updateresource.domain = resource.domain;
		updateresource.target = resource.target;
		updateresource.priority = resource.priority;
		updateresource.weight = resource.weight;
		updateresource.port = resource.port;
		updateresource.ttl = resource.ttl;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dnssrvrec resources.
	*/
	public static base_responses update(nitro_service client, dnssrvrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnssrvrec updateresources[] = new dnssrvrec[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dnssrvrec();
				updateresources[i].domain = resources[i].domain;
				updateresources[i].target = resources[i].target;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].weight = resources[i].weight;
				updateresources[i].port = resources[i].port;
				updateresources[i].ttl = resources[i].ttl;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnssrvrec resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String domain, String args[]) throws Exception {
		dnssrvrec unsetresource = new dnssrvrec();
		unsetresource.domain = domain;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of dnssrvrec resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, dnssrvrec resource, String[] args) throws Exception{
		dnssrvrec unsetresource = new dnssrvrec();
		unsetresource.domain = resource.domain;
		unsetresource.target = resource.target;
		unsetresource.ttl = resource.ttl;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of dnssrvrec resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String domain[], String args[]) throws Exception {
		base_responses result = null;
		if (domain != null && domain.length > 0) {
			dnssrvrec unsetresources[] = new dnssrvrec[domain.length];
			for (int i=0;i<domain.length;i++){
				unsetresources[i] = new dnssrvrec();
				unsetresources[i].domain = domain[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnssrvrec resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, dnssrvrec resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnssrvrec unsetresources[] = new dnssrvrec[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new dnssrvrec();
				unsetresources[i].domain = resources[i].domain;
				unsetresources[i].target = resources[i].target;
				unsetresources[i].ttl = resources[i].ttl;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnssrvrec resources that are configured on netscaler.
	*/
	public static dnssrvrec[] get(nitro_service service) throws Exception{
		dnssrvrec obj = new dnssrvrec();
		dnssrvrec[] response = (dnssrvrec[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnssrvrec resources that are configured on netscaler.
	*/
	public static dnssrvrec[] get(nitro_service service, options option) throws Exception{
		dnssrvrec obj = new dnssrvrec();
		dnssrvrec[] response = (dnssrvrec[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a dnssrvrec resource.
	*/
	public static dnssrvrec get(nitro_service service, dnssrvrec obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		dnssrvrec response = (dnssrvrec) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a dnssrvrec resources.
	*/
	public static dnssrvrec[] get(nitro_service service, dnssrvrec obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			dnssrvrec response[] = new dnssrvrec[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (dnssrvrec) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch all the dnssrvrec resources that are configured on netscaler.
	* This uses dnssrvrec_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dnssrvrec[] get(nitro_service service, dnssrvrec_args args) throws Exception{
		dnssrvrec obj = new dnssrvrec();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dnssrvrec[] response = (dnssrvrec[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnssrvrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnssrvrec[] get_filtered(nitro_service service, String filter) throws Exception{
		dnssrvrec obj = new dnssrvrec();
		options option = new options();
		option.set_filter(filter);
		dnssrvrec[] response = (dnssrvrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnssrvrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnssrvrec[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnssrvrec obj = new dnssrvrec();
		options option = new options();
		option.set_filter(filter);
		dnssrvrec[] response = (dnssrvrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnssrvrec resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnssrvrec obj = new dnssrvrec();
		options option = new options();
		option.set_count(true);
		dnssrvrec[] response = (dnssrvrec[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnssrvrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnssrvrec obj = new dnssrvrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnssrvrec[] response = (dnssrvrec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnssrvrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnssrvrec obj = new dnssrvrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnssrvrec[] response = (dnssrvrec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class authtypeEnum {
		public static final String ALL = "ALL";
		public static final String ADNS = "ADNS";
		public static final String PROXY = "PROXY";
	}
	public static class typeEnum {
		public static final String ALL = "ALL";
		public static final String ADNS = "ADNS";
		public static final String PROXY = "PROXY";
	}
}
