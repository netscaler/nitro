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

class dnssoarec_response extends base_response
{
	public dnssoarec[] dnssoarec;
}
/**
* Configuration for SOA record resource.
*/

public class dnssoarec extends base_resource
{
	private String domain;
	private String originserver;
	private String contact;
	private Long serial;
	private Long refresh;
	private Long retry;
	private Long expire;
	private Long minimum;
	private Long ttl;
	private String type;

	//------- Read only Parameter ---------;

	private String authtype;
	private Long __count;

	/**
	* <pre>
	* The domain name for which the SOA record is added.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domain(String domain) throws Exception{
		this.domain = domain;
	}

	/**
	* <pre>
	* The domain name for which the SOA record is added.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domain() throws Exception {
		return this.domain;
	}

	/**
	* <pre>
	* The name of the origin server for the given domain.<br> Minimum length =  1
	* </pre>
	*/
	public void set_originserver(String originserver) throws Exception{
		this.originserver = originserver;
	}

	/**
	* <pre>
	* The name of the origin server for the given domain.<br> Minimum length =  1
	* </pre>
	*/
	public String get_originserver() throws Exception {
		return this.originserver;
	}

	/**
	* <pre>
	* The contact person for this ADNS. Typically this is an email address for which the at sign (@) has been replaced by a period (.).<br> Minimum length =  1
	* </pre>
	*/
	public void set_contact(String contact) throws Exception{
		this.contact = contact;
	}

	/**
	* <pre>
	* The contact person for this ADNS. Typically this is an email address for which the at sign (@) has been replaced by a period (.).<br> Minimum length =  1
	* </pre>
	*/
	public String get_contact() throws Exception {
		return this.contact;
	}

	/**
	* <pre>
	* The secondary server uses this parameter to determine if it requires a zone transfer from the primary server. If the secondary server's number is lower than the primary's, the secondary server knows that its records are out of date. This parameter is not used by a primary server.<br> Default value: 100<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_serial(long serial) throws Exception {
		this.serial = new Long(serial);
	}

	/**
	* <pre>
	* The secondary server uses this parameter to determine if it requires a zone transfer from the primary server. If the secondary server's number is lower than the primary's, the secondary server knows that its records are out of date. This parameter is not used by a primary server.<br> Default value: 100<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_serial(Long serial) throws Exception{
		this.serial = serial;
	}

	/**
	* <pre>
	* The secondary server uses this parameter to determine if it requires a zone transfer from the primary server. If the secondary server's number is lower than the primary's, the secondary server knows that its records are out of date. This parameter is not used by a primary server.<br> Default value: 100<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_serial() throws Exception {
		return this.serial;
	}

	/**
	* <pre>
	* The number of seconds between a successful serial number check on the primary server's zone, and the next attempt. It is usually 2-24 hours. This value is not used by a primary server.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_refresh(long refresh) throws Exception {
		this.refresh = new Long(refresh);
	}

	/**
	* <pre>
	* The number of seconds between a successful serial number check on the primary server's zone, and the next attempt. It is usually 2-24 hours. This value is not used by a primary server.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_refresh(Long refresh) throws Exception{
		this.refresh = refresh;
	}

	/**
	* <pre>
	* The number of seconds between a successful serial number check on the primary server's zone, and the next attempt. It is usually 2-24 hours. This value is not used by a primary server.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_refresh() throws Exception {
		return this.refresh;
	}

	/**
	* <pre>
	* When a refresh attempt fails, a server will retry after the specified number of seconds. This parameter is not used by a primary server.<br> Default value: 3<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_retry(long retry) throws Exception {
		this.retry = new Long(retry);
	}

	/**
	* <pre>
	* When a refresh attempt fails, a server will retry after the specified number of seconds. This parameter is not used by a primary server.<br> Default value: 3<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_retry(Long retry) throws Exception{
		this.retry = retry;
	}

	/**
	* <pre>
	* When a refresh attempt fails, a server will retry after the specified number of seconds. This parameter is not used by a primary server.<br> Default value: 3<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_retry() throws Exception {
		return this.retry;
	}

	/**
	* <pre>
	* Measured in seconds. If the refresh and retry attempts fail after the specified number of seconds, the server will stop serving the zone. The typical value is 1 week. This parameter is not used by a primary server.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_expire(long expire) throws Exception {
		this.expire = new Long(expire);
	}

	/**
	* <pre>
	* Measured in seconds. If the refresh and retry attempts fail after the specified number of seconds, the server will stop serving the zone. The typical value is 1 week. This parameter is not used by a primary server.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_expire(Long expire) throws Exception{
		this.expire = expire;
	}

	/**
	* <pre>
	* Measured in seconds. If the refresh and retry attempts fail after the specified number of seconds, the server will stop serving the zone. The typical value is 1 week. This parameter is not used by a primary server.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_expire() throws Exception {
		return this.expire;
	}

	/**
	* <pre>
	* The default TTL for every record in the zone. You can override this value for a particular record. Typical values range from eight hours to four days. This value is often set at ten minutes or less when changes are being made to a zone.<br> Default value: 5<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_minimum(long minimum) throws Exception {
		this.minimum = new Long(minimum);
	}

	/**
	* <pre>
	* The default TTL for every record in the zone. You can override this value for a particular record. Typical values range from eight hours to four days. This value is often set at ten minutes or less when changes are being made to a zone.<br> Default value: 5<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_minimum(Long minimum) throws Exception{
		this.minimum = minimum;
	}

	/**
	* <pre>
	* The default TTL for every record in the zone. You can override this value for a particular record. Typical values range from eight hours to four days. This value is often set at ten minutes or less when changes are being made to a zone.<br> Default value: 5<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_minimum() throws Exception {
		return this.minimum;
	}

	/**
	* <pre>
	* The time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* The time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* The time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* The SOA record type. The type can take 3 values :
ADNS -  If this is specified, all of the authoritative SOA records will be displayed.
PROXY - If this is specified, all the proxy SOA records will be displayed.
ALL  -  If this is specified, all the SOA records will be displayed.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The SOA record type. The type can take 3 values :
ADNS -  If this is specified, all of the authoritative SOA records will be displayed.
PROXY - If this is specified, all the proxy SOA records will be displayed.
ALL  -  If this is specified, all the SOA records will be displayed.<br> Possible values = ALL, ADNS, PROXY
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
		dnssoarec_response result = (dnssoarec_response) service.get_payload_formatter().string_to_resource(dnssoarec_response.class, response);
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
		return result.dnssoarec;
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
	* Use this API to add dnssoarec.
	*/
	public static base_response add(nitro_service client, dnssoarec resource) throws Exception {
		dnssoarec addresource = new dnssoarec();
		addresource.domain = resource.domain;
		addresource.originserver = resource.originserver;
		addresource.contact = resource.contact;
		addresource.serial = resource.serial;
		addresource.refresh = resource.refresh;
		addresource.retry = resource.retry;
		addresource.expire = resource.expire;
		addresource.minimum = resource.minimum;
		addresource.ttl = resource.ttl;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnssoarec resources.
	*/
	public static base_responses add(nitro_service client, dnssoarec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnssoarec addresources[] = new dnssoarec[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnssoarec();
				addresources[i].domain = resources[i].domain;
				addresources[i].originserver = resources[i].originserver;
				addresources[i].contact = resources[i].contact;
				addresources[i].serial = resources[i].serial;
				addresources[i].refresh = resources[i].refresh;
				addresources[i].retry = resources[i].retry;
				addresources[i].expire = resources[i].expire;
				addresources[i].minimum = resources[i].minimum;
				addresources[i].ttl = resources[i].ttl;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnssoarec of given name.
	*/
	public static base_response delete(nitro_service client, String domain) throws Exception {
		dnssoarec deleteresource = new dnssoarec();
		deleteresource.domain = domain;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnssoarec.
	*/
	public static base_response delete(nitro_service client, dnssoarec resource) throws Exception {
		dnssoarec deleteresource = new dnssoarec();
		deleteresource.domain = resource.domain;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnssoarec resources of given names.
	*/
	public static base_responses delete(nitro_service client, String domain[]) throws Exception {
		base_responses result = null;
		if (domain != null && domain.length > 0) {
			dnssoarec deleteresources[] = new dnssoarec[domain.length];
			for (int i=0;i<domain.length;i++){
				deleteresources[i] = new dnssoarec();
				deleteresources[i].domain = domain[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnssoarec resources.
	*/
	public static base_responses delete(nitro_service client, dnssoarec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnssoarec deleteresources[] = new dnssoarec[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnssoarec();
				deleteresources[i].domain = resources[i].domain;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update dnssoarec.
	*/
	public static base_response update(nitro_service client, dnssoarec resource) throws Exception {
		dnssoarec updateresource = new dnssoarec();
		updateresource.domain = resource.domain;
		updateresource.originserver = resource.originserver;
		updateresource.contact = resource.contact;
		updateresource.serial = resource.serial;
		updateresource.refresh = resource.refresh;
		updateresource.retry = resource.retry;
		updateresource.expire = resource.expire;
		updateresource.minimum = resource.minimum;
		updateresource.ttl = resource.ttl;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dnssoarec resources.
	*/
	public static base_responses update(nitro_service client, dnssoarec resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnssoarec updateresources[] = new dnssoarec[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dnssoarec();
				updateresources[i].domain = resources[i].domain;
				updateresources[i].originserver = resources[i].originserver;
				updateresources[i].contact = resources[i].contact;
				updateresources[i].serial = resources[i].serial;
				updateresources[i].refresh = resources[i].refresh;
				updateresources[i].retry = resources[i].retry;
				updateresources[i].expire = resources[i].expire;
				updateresources[i].minimum = resources[i].minimum;
				updateresources[i].ttl = resources[i].ttl;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnssoarec resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String domain, String args[]) throws Exception {
		dnssoarec unsetresource = new dnssoarec();
		unsetresource.domain = domain;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of dnssoarec resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, dnssoarec resource, String[] args) throws Exception{
		dnssoarec unsetresource = new dnssoarec();
		unsetresource.domain = resource.domain;
		unsetresource.serial = resource.serial;
		unsetresource.refresh = resource.refresh;
		unsetresource.retry = resource.retry;
		unsetresource.expire = resource.expire;
		unsetresource.minimum = resource.minimum;
		unsetresource.ttl = resource.ttl;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of dnssoarec resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String domain[], String args[]) throws Exception {
		base_responses result = null;
		if (domain != null && domain.length > 0) {
			dnssoarec unsetresources[] = new dnssoarec[domain.length];
			for (int i=0;i<domain.length;i++){
				unsetresources[i] = new dnssoarec();
				unsetresources[i].domain = domain[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnssoarec resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, dnssoarec resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnssoarec unsetresources[] = new dnssoarec[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new dnssoarec();
				unsetresources[i].domain = resources[i].domain;
				unsetresources[i].serial = resources[i].serial;
				unsetresources[i].refresh = resources[i].refresh;
				unsetresources[i].retry = resources[i].retry;
				unsetresources[i].expire = resources[i].expire;
				unsetresources[i].minimum = resources[i].minimum;
				unsetresources[i].ttl = resources[i].ttl;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnssoarec resources that are configured on netscaler.
	*/
	public static dnssoarec[] get(nitro_service service) throws Exception{
		dnssoarec obj = new dnssoarec();
		dnssoarec[] response = (dnssoarec[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnssoarec resources that are configured on netscaler.
	*/
	public static dnssoarec[] get(nitro_service service, options option) throws Exception{
		dnssoarec obj = new dnssoarec();
		dnssoarec[] response = (dnssoarec[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the dnssoarec resources that are configured on netscaler.
	* This uses dnssoarec_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static dnssoarec[] get(nitro_service service, dnssoarec_args args) throws Exception{
		dnssoarec obj = new dnssoarec();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		dnssoarec[] response = (dnssoarec[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch dnssoarec resource of given name .
	*/
	public static dnssoarec get(nitro_service service, String domain) throws Exception{
		dnssoarec obj = new dnssoarec();
		obj.set_domain(domain);
		dnssoarec response = (dnssoarec) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnssoarec resources of given names .
	*/
	public static dnssoarec[] get(nitro_service service, String domain[]) throws Exception{
		if (domain !=null && domain.length>0) {
			dnssoarec response[] = new dnssoarec[domain.length];
			dnssoarec obj[] = new dnssoarec[domain.length];
			for (int i=0;i<domain.length;i++) {
				obj[i] = new dnssoarec();
				obj[i].set_domain(domain[i]);
				response[i] = (dnssoarec) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnssoarec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnssoarec[] get_filtered(nitro_service service, String filter) throws Exception{
		dnssoarec obj = new dnssoarec();
		options option = new options();
		option.set_filter(filter);
		dnssoarec[] response = (dnssoarec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnssoarec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnssoarec[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnssoarec obj = new dnssoarec();
		options option = new options();
		option.set_filter(filter);
		dnssoarec[] response = (dnssoarec[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnssoarec resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnssoarec obj = new dnssoarec();
		options option = new options();
		option.set_count(true);
		dnssoarec[] response = (dnssoarec[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnssoarec resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnssoarec obj = new dnssoarec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnssoarec[] response = (dnssoarec[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnssoarec resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnssoarec obj = new dnssoarec();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnssoarec[] response = (dnssoarec[]) obj.getfiltered(service, option);
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
