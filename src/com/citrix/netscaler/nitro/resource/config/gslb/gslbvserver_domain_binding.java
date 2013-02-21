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

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbvserver_domain_binding_response extends base_response
{
	public gslbvserver_domain_binding[] gslbvserver_domain_binding;
}
/**
	* Binding class showing the domain that can be bound to gslbvserver.
	*/

public class gslbvserver_domain_binding extends base_resource
{
	private String domainname;
	private Long ttl;
	private String backupip;
	private String cookie_domain;
	private Long cookietimeout;
	private Long sitedomainttl;
	private String name;
	private Boolean backupipflag;
	private Boolean cookie_domainflag;
	private Long __count;

	/**
	* <pre>
	* The backup IP addresss that has to be unbound from for the specified GSLB domain.
	* </pre>
	*/
	public void set_backupipflag(boolean backupipflag) throws Exception {
		this.backupipflag = new Boolean(backupipflag);
	}

	/**
	* <pre>
	* The backup IP addresss that has to be unbound from for the specified GSLB domain.
	* </pre>
	*/
	public void set_backupipflag(Boolean backupipflag) throws Exception{
		this.backupipflag = backupipflag;
	}

	/**
	* <pre>
	* The backup IP addresss that has to be unbound from for the specified GSLB domain.
	* </pre>
	*/
	public Boolean get_backupipflag() throws Exception {
		return this.backupipflag;
	}

	/**
	* <pre>
	* The timeout (in minutes) for the GSLB site cookie.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_cookietimeout(long cookietimeout) throws Exception {
		this.cookietimeout = new Long(cookietimeout);
	}

	/**
	* <pre>
	* The timeout (in minutes) for the GSLB site cookie.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public void set_cookietimeout(Long cookietimeout) throws Exception{
		this.cookietimeout = cookietimeout;
	}

	/**
	* <pre>
	* The timeout (in minutes) for the GSLB site cookie.<br> Minimum value =  0<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_cookietimeout() throws Exception {
		return this.cookietimeout;
	}

	/**
	* <pre>
	* The backup IP for the given domain.<br> Minimum length =  1
	* </pre>
	*/
	public void set_backupip(String backupip) throws Exception{
		this.backupip = backupip;
	}

	/**
	* <pre>
	* The backup IP for the given domain.<br> Minimum length =  1
	* </pre>
	*/
	public String get_backupip() throws Exception {
		return this.backupip;
	}

	/**
	* <pre>
	* The vserver for which the binding operation is to be done.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The vserver for which the binding operation is to be done.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The TTL for the given domain.<br> Minimum value =  1
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* The TTL for the given domain.<br> Minimum value =  1
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* The TTL for the given domain.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* The name of the domain for which TTL and/or backupIP has to be changed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_domainname(String domainname) throws Exception{
		this.domainname = domainname;
	}

	/**
	* <pre>
	* The name of the domain for which TTL and/or backupIP has to be changed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_domainname() throws Exception {
		return this.domainname;
	}

	/**
	* <pre>
	* Modify the TTL of the internally created site domain.<br> Minimum value =  1
	* </pre>
	*/
	public void set_sitedomainttl(long sitedomainttl) throws Exception {
		this.sitedomainttl = new Long(sitedomainttl);
	}

	/**
	* <pre>
	* Modify the TTL of the internally created site domain.<br> Minimum value =  1
	* </pre>
	*/
	public void set_sitedomainttl(Long sitedomainttl) throws Exception{
		this.sitedomainttl = sitedomainttl;
	}

	/**
	* <pre>
	* Modify the TTL of the internally created site domain.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_sitedomainttl() throws Exception {
		return this.sitedomainttl;
	}

	/**
	* <pre>
	* Unset the configured cookie domain for this domain.
	* </pre>
	*/
	public void set_cookie_domainflag(boolean cookie_domainflag) throws Exception {
		this.cookie_domainflag = new Boolean(cookie_domainflag);
	}

	/**
	* <pre>
	* Unset the configured cookie domain for this domain.
	* </pre>
	*/
	public void set_cookie_domainflag(Boolean cookie_domainflag) throws Exception{
		this.cookie_domainflag = cookie_domainflag;
	}

	/**
	* <pre>
	* Unset the configured cookie domain for this domain.
	* </pre>
	*/
	public Boolean get_cookie_domainflag() throws Exception {
		return this.cookie_domainflag;
	}

	/**
	* <pre>
	* The cookie domain for the GSLB domain. This will be used when inserting the GSLB site cookie in the HTTP response. By default, cookie domain will not be inserted.<br> Minimum length =  1
	* </pre>
	*/
	public void set_cookie_domain(String cookie_domain) throws Exception{
		this.cookie_domain = cookie_domain;
	}

	/**
	* <pre>
	* The cookie domain for the GSLB domain. This will be used when inserting the GSLB site cookie in the HTTP response. By default, cookie domain will not be inserted.<br> Minimum length =  1
	* </pre>
	*/
	public String get_cookie_domain() throws Exception {
		return this.cookie_domain;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbvserver_domain_binding_response result = (gslbvserver_domain_binding_response) service.get_payload_formatter().string_to_resource(gslbvserver_domain_binding_response.class, response);
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
		return result.gslbvserver_domain_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, gslbvserver_domain_binding resource) throws Exception {
		gslbvserver_domain_binding updateresource = new gslbvserver_domain_binding();
		updateresource.name = resource.name;
		updateresource.domainname = resource.domainname;
		updateresource.ttl = resource.ttl;
		updateresource.backupip = resource.backupip;
		updateresource.cookie_domain = resource.cookie_domain;
		updateresource.cookietimeout = resource.cookietimeout;
		updateresource.sitedomainttl = resource.sitedomainttl;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, gslbvserver_domain_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbvserver_domain_binding updateresources[] = new gslbvserver_domain_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new gslbvserver_domain_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].domainname = resources[i].domainname;
				updateresources[i].ttl = resources[i].ttl;
				updateresources[i].backupip = resources[i].backupip;
				updateresources[i].cookie_domain = resources[i].cookie_domain;
				updateresources[i].cookietimeout = resources[i].cookietimeout;
				updateresources[i].sitedomainttl = resources[i].sitedomainttl;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, gslbvserver_domain_binding resource) throws Exception {
		gslbvserver_domain_binding deleteresource = new gslbvserver_domain_binding();
		deleteresource.name = resource.name;
		deleteresource.domainname = resource.domainname;
		deleteresource.backupipflag = resource.backupipflag;
		deleteresource.cookie_domainflag = resource.cookie_domainflag;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, gslbvserver_domain_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			gslbvserver_domain_binding deleteresources[] = new gslbvserver_domain_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new gslbvserver_domain_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].domainname = resources[i].domainname;
				deleteresources[i].backupipflag = resources[i].backupipflag;
				deleteresources[i].cookie_domainflag = resources[i].cookie_domainflag;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch gslbvserver_domain_binding resources of given name .
	*/
	public static gslbvserver_domain_binding[] get(nitro_service service, String name) throws Exception{
		gslbvserver_domain_binding obj = new gslbvserver_domain_binding();
		obj.set_name(name);
		gslbvserver_domain_binding response[] = (gslbvserver_domain_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of gslbvserver_domain_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static gslbvserver_domain_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		gslbvserver_domain_binding obj = new gslbvserver_domain_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		gslbvserver_domain_binding[] response = (gslbvserver_domain_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of gslbvserver_domain_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static gslbvserver_domain_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		gslbvserver_domain_binding obj = new gslbvserver_domain_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		gslbvserver_domain_binding[] response = (gslbvserver_domain_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count gslbvserver_domain_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		gslbvserver_domain_binding obj = new gslbvserver_domain_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		gslbvserver_domain_binding response[] = (gslbvserver_domain_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of gslbvserver_domain_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		gslbvserver_domain_binding obj = new gslbvserver_domain_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbvserver_domain_binding[] response = (gslbvserver_domain_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of gslbvserver_domain_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		gslbvserver_domain_binding obj = new gslbvserver_domain_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		gslbvserver_domain_binding[] response = (gslbvserver_domain_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}