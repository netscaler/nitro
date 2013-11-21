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

class dnsmxrec_response extends base_response
{
	public dnsmxrec[] dnsmxrec;
}
/**
* Configuration for MX record resource.
*/

public class dnsmxrec extends base_resource
{
	private String domain;
	private String mx;
	private Long pref;
	private Long ttl;
	private String type;

	//------- Read only Parameter ---------;

	private String authtype;
	private Long __count;

	/**
	* <pre>
	* Domain name for which to add the MX record.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* Domain name for which to add the MX record.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* Host name of the mail exchange server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_mx(String mx) throws Exception{
		this.mx = mx;
	}

	/**
	* <pre>
	* Host name of the mail exchange server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_mx() throws Exception {
		return this.mx;
	}

	/**
	* <pre>
	* Priority number to assign to the mail exchange server. A domain name can have multiple mail servers, with a priority number assigned to each server. The lower the priority number, the higher the mail server's priority. When other mail servers have to deliver mail to the specified domain, they begin with the mail server with the lowest priority number, and use other configured mail servers, in priority order, as backups.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_pref(long pref) throws Exception {
		this.pref = new Long(pref);
	}

	/**
	* <pre>
	* Priority number to assign to the mail exchange server. A domain name can have multiple mail servers, with a priority number assigned to each server. The lower the priority number, the higher the mail server's priority. When other mail servers have to deliver mail to the specified domain, they begin with the mail server with the lowest priority number, and use other configured mail servers, in priority order, as backups.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public void set_pref(Long pref) throws Exception{
		this.pref = pref;
	}

	/**
	* <pre>
	* Priority number to assign to the mail exchange server. A domain name can have multiple mail servers, with a priority number assigned to each server. The lower the priority number, the higher the mail server's priority. When other mail servers have to deliver mail to the specified domain, they begin with the mail server with the lowest priority number, and use other configured mail servers, in priority order, as backups.<br> Minimum value =  0<br> Maximum value =  65535
	* </pre>
	*/
	public Long get_pref() throws Exception {
		return this.pref;
	}

	/**
	* <pre>
	* Time to Live (TTL), in seconds, for the record. TTL is the time for which the record must be cached by DNS proxies. The specified TTL is applied to all the resource records that are of the same record type and belong to the specified domain name. For example, if you add an address record, with a TTL of 36000, to the domain name example.com, the TTLs of all the address records of example.com are changed to 36000. If the TTL is not specified, the NetScaler appliance uses either the DNS zone's minimum TTL or, if the SOA record is not available on the appliance, the default value of 3600.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* Time to Live (TTL), in seconds, for the record. TTL is the time for which the record must be cached by DNS proxies. The specified TTL is applied to all the resource records that are of the same record type and belong to the specified domain name. For example, if you add an address record, with a TTL of 36000, to the domain name example.com, the TTLs of all the address records of example.com are changed to 36000. If the TTL is not specified, the NetScaler appliance uses either the DNS zone's minimum TTL or, if the SOA record is not available on the appliance, the default value of 3600.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* Time to Live (TTL), in seconds, for the record. TTL is the time for which the record must be cached by DNS proxies. The specified TTL is applied to all the resource records that are of the same record type and belong to the specified domain name. For example, if you add an address record, with a TTL of 36000, to the domain name example.com, the TTLs of all the address records of example.com are changed to 36000. If the TTL is not specified, the NetScaler appliance uses either the DNS zone's minimum TTL or, if the SOA record is not available on the appliance, the default value of 3600.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* Type of records to display. Available settings function as follows:
* ADNS - Display all authoritative address records.
* PROXY - Display all proxy address records.
* ALL - Display all address records.<br> Default value: ADNS<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Type of records to display. Available settings function as follows:
* ADNS - Display all authoritative address records.
* PROXY - Display all proxy address records.
* ALL - Display all address records.<br> Default value: ADNS<br> Possible values = ALL, ADNS, PROXY
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
		dnsmxrec_response result = (dnsmxrec_response) service.get_payload_formatter().string_to_resource(dnsmxrec_response.class, response);
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
		return result.dnsmxrec;
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
	* Use this API to add dnsmxrec.
	*/
	public static base_response add(nitro_service client, dnsmxrec resource) throws Exception {
		dnsmxrec addresource = new dnsmxrec();
		addresource.domain = resource.domain;
		addresource.mx = resource.mx;
		addresource.pref = resource.pref;
		addresource.ttl = resource.ttl;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnsmxrec resources.
	*/
	public static base_responses add(nitro_service client, dnsmxrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsmxrec addresources[] = new dnsmxrec[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnsmxrec();
				addresources[i].domain = resources[i].domain;
				addresources[i].mx = resources[i].mx;
				addresources[i].pref = resources[i].pref;
				addresources[i].ttl = resources[i].ttl;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsmxrec of given name.
	*/
	public static base_response delete(nitro_service client, String domain) throws Exception {
		dnsmxrec deleteresource = new dnsmxrec();
		deleteresource.domain = domain;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsmxrec.
	*/
	public static base_response delete(nitro_service client, dnsmxrec resource) throws Exception {
		dnsmxrec deleteresource = new dnsmxrec();
		deleteresource.domain = resource.domain;
		deleteresource.mx = resource.mx;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnsmxrec resources of given names.
	*/
	public static base_responses delete(nitro_service client, String domain[]) throws Exception {
		base_responses result = null;
		if (domain != null && domain.length > 0) {
			dnsmxrec deleteresources[] = new dnsmxrec[domain.length];
			for (int i=0;i<domain.length;i++){
				deleteresources[i] = new dnsmxrec();
				deleteresources[i].domain = domain[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnsmxrec resources.
	*/
	public static base_responses delete(nitro_service client, dnsmxrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsmxrec deleteresources[] = new dnsmxrec[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnsmxrec();
				deleteresources[i].domain = resources[i].domain;
				deleteresources[i].mx = resources[i].mx;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update dnsmxrec.
	*/
	public static base_response update(nitro_service client, dnsmxrec resource) throws Exception {
		dnsmxrec updateresource = new dnsmxrec();
		updateresource.domain = resource.domain;
		updateresource.mx = resource.mx;
		updateresource.pref = resource.pref;
		updateresource.ttl = resource.ttl;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dnsmxrec resources.
	*/
	public static base_responses update(nitro_service client, dnsmxrec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsmxrec updateresources[] = new dnsmxrec[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dnsmxrec();
				updateresources[i].domain = resources[i].domain;
				updateresources[i].mx = resources[i].mx;
				updateresources[i].pref = resources[i].pref;
				updateresources[i].ttl = resources[i].ttl;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnsmxrec resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, dnsmxrec resource, String[] args) throws Exception{
		dnsmxrec unsetresource = new dnsmxrec();
		unsetresource.domain = resource.domain;
		unsetresource.mx = resource.mx;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of dnsmxrec resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, dnsmxrec resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnsmxrec unsetresources[] = new dnsmxrec[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new dnsmxrec();
				unsetresources[i].domain = resources[i].domain;
				unsetresources[i].mx = resources[i].mx;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnsmxrec resources that are configured on netscaler.
	*/
	public static dnsmxrec[] get(nitro_service service) throws Exception{
		dnsmxrec obj = new dnsmxrec();
		dnsmxrec[] response = (dnsmxrec[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnsmxrec resources that are configured on netscaler.
	*/
	public static dnsmxrec[] get(nitro_service service, options option) throws Exception{
		dnsmxrec obj = new dnsmxrec();
		dnsmxrec[] response = (dnsmxrec[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the dnsmxrec resources that are configured on netscaler.
	* This uses dnsmxrec_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dnsmxrec[] get(nitro_service service, dnsmxrec_args args) throws Exception{
		dnsmxrec obj = new dnsmxrec();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dnsmxrec[] response = (dnsmxrec[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch dnsmxrec resource of given name .
	*/
	public static dnsmxrec get(nitro_service service, String domain) throws Exception{
		dnsmxrec obj = new dnsmxrec();
		obj.set_domain(domain);
		dnsmxrec response = (dnsmxrec) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnsmxrec resources of given names .
	*/
	public static dnsmxrec[] get(nitro_service service, String domain[]) throws Exception{
		if (domain !=null && domain.length>0) {
			dnsmxrec response[] = new dnsmxrec[domain.length];
			dnsmxrec obj[] = new dnsmxrec[domain.length];
			for (int i=0;i<domain.length;i++) {
				obj[i] = new dnsmxrec();
				obj[i].set_domain(domain[i]);
				response[i] = (dnsmxrec) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnsmxrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnsmxrec[] get_filtered(nitro_service service, String filter) throws Exception{
		dnsmxrec obj = new dnsmxrec();
		options option = new options();
		option.set_filter(filter);
		dnsmxrec[] response = (dnsmxrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnsmxrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnsmxrec[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsmxrec obj = new dnsmxrec();
		options option = new options();
		option.set_filter(filter);
		dnsmxrec[] response = (dnsmxrec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnsmxrec resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnsmxrec obj = new dnsmxrec();
		options option = new options();
		option.set_count(true);
		dnsmxrec[] response = (dnsmxrec[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnsmxrec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnsmxrec obj = new dnsmxrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsmxrec[] response = (dnsmxrec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnsmxrec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnsmxrec obj = new dnsmxrec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnsmxrec[] response = (dnsmxrec[]) obj.getfiltered(service, option);
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
