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

package com.citrix.netscaler.nitro.resource.config.cache;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cacheparameter_response extends base_response
{
	public cacheparameter cacheparameter;
}
/**
* Configuration for cache parameter resource.
*/

public class cacheparameter extends base_resource
{
	private Long memlimit;
	private String via;
	private String verifyusing;
	private Long maxpostlen;
	private Long prefetchmaxpending;
	private String enablebypass;
	private String undefaction;

	//------- Read only Parameter ---------;

	private Long memlimitactive;
	private Long maxmemlimit;
	private Long prefetchcur;

	/**
	* <pre>
	* The memory limit for Integrated Cache.
	* </pre>
	*/
	public void set_memlimit(long memlimit) throws Exception {
		this.memlimit = new Long(memlimit);
	}

	/**
	* <pre>
	* The memory limit for Integrated Cache.
	* </pre>
	*/
	public void set_memlimit(Long memlimit) throws Exception{
		this.memlimit = memlimit;
	}

	/**
	* <pre>
	* The memory limit for Integrated Cache.
	* </pre>
	*/
	public Long get_memlimit() throws Exception {
		return this.memlimit;
	}

	/**
	* <pre>
	* The string to be inserted in the "Via" header. A Via header is inserted in all responses served from a content group if its insertVia flag is set.<br> Minimum length =  1
	* </pre>
	*/
	public void set_via(String via) throws Exception{
		this.via = via;
	}

	/**
	* <pre>
	* The string to be inserted in the "Via" header. A Via header is inserted in all responses served from a content group if its insertVia flag is set.<br> Minimum length =  1
	* </pre>
	*/
	public String get_via() throws Exception {
		return this.via;
	}

	/**
	* <pre>
	* The criteria for deciding whether a cached object can be served for an incoming HTTP request.
a.	If the value of this attribute is set to HOSTNAME, then URL , host name  and host port values in the incoming HTTP request header must match before a cached object can be served. The IP address and the TCP port of the destination host are not matched.
For certain deployments the HOSTNAME setting can be a security risk.
A rogue client can access a rogue server via the Integrated Cache using the following HTTP request :
GET / HTTP/1.1
Host: sensitive.foo.com

Integrated Cache will store the rogue page served by the rogue server. Any subsequent client trying to access the root page from sensitive.foo.com will be served the rogue page.

The HOSTNAME setting should only be set if it is certain that no rogue client can access a rogue server via the Integrated Cache.
The YES setting can lead to more hits if DNS-based load balancing is in use and the same content can be served by multiple backend servers.
b.	If the attribute is set to HOSTNAME_AND_IP, then the following items must match: URL, host name, host port in the incoming HTTP request header, and the IP address and TCP port of the destination server.
c.	If the attribute is set to DNS, then the following items should match: URL, host name and host
port in the incoming HTTP request, and the TCP port.
The hostname is used to do a DNS lookup of the destination server's IP address, and is compared with the set of addresses returned by the DNS lookup.
The default value of this attribute is DNS.<br> Possible values = HOSTNAME, HOSTNAME_AND_IP, DNS
	* </pre>
	*/
	public void set_verifyusing(String verifyusing) throws Exception{
		this.verifyusing = verifyusing;
	}

	/**
	* <pre>
	* The criteria for deciding whether a cached object can be served for an incoming HTTP request.
a.	If the value of this attribute is set to HOSTNAME, then URL , host name  and host port values in the incoming HTTP request header must match before a cached object can be served. The IP address and the TCP port of the destination host are not matched.
For certain deployments the HOSTNAME setting can be a security risk.
A rogue client can access a rogue server via the Integrated Cache using the following HTTP request :
GET / HTTP/1.1
Host: sensitive.foo.com

Integrated Cache will store the rogue page served by the rogue server. Any subsequent client trying to access the root page from sensitive.foo.com will be served the rogue page.

The HOSTNAME setting should only be set if it is certain that no rogue client can access a rogue server via the Integrated Cache.
The YES setting can lead to more hits if DNS-based load balancing is in use and the same content can be served by multiple backend servers.
b.	If the attribute is set to HOSTNAME_AND_IP, then the following items must match: URL, host name, host port in the incoming HTTP request header, and the IP address and TCP port of the destination server.
c.	If the attribute is set to DNS, then the following items should match: URL, host name and host
port in the incoming HTTP request, and the TCP port.
The hostname is used to do a DNS lookup of the destination server's IP address, and is compared with the set of addresses returned by the DNS lookup.
The default value of this attribute is DNS.<br> Possible values = HOSTNAME, HOSTNAME_AND_IP, DNS
	* </pre>
	*/
	public String get_verifyusing() throws Exception {
		return this.verifyusing;
	}

	/**
	* <pre>
	* maximum number of POST body bytes to consider when evaluating parameters for a content group for which you have configured hitParams and invalParams.<br> Default value: 4096<br> Minimum value =  0<br> Maximum value =  131072
	* </pre>
	*/
	public void set_maxpostlen(long maxpostlen) throws Exception {
		this.maxpostlen = new Long(maxpostlen);
	}

	/**
	* <pre>
	* maximum number of POST body bytes to consider when evaluating parameters for a content group for which you have configured hitParams and invalParams.<br> Default value: 4096<br> Minimum value =  0<br> Maximum value =  131072
	* </pre>
	*/
	public void set_maxpostlen(Long maxpostlen) throws Exception{
		this.maxpostlen = maxpostlen;
	}

	/**
	* <pre>
	* maximum number of POST body bytes to consider when evaluating parameters for a content group for which you have configured hitParams and invalParams.<br> Default value: 4096<br> Minimum value =  0<br> Maximum value =  131072
	* </pre>
	*/
	public Long get_maxpostlen() throws Exception {
		return this.maxpostlen;
	}

	/**
	* <pre>
	* The maximum number of outstanding prefetches in the IC.
	* </pre>
	*/
	public void set_prefetchmaxpending(long prefetchmaxpending) throws Exception {
		this.prefetchmaxpending = new Long(prefetchmaxpending);
	}

	/**
	* <pre>
	* The maximum number of outstanding prefetches in the IC.
	* </pre>
	*/
	public void set_prefetchmaxpending(Long prefetchmaxpending) throws Exception{
		this.prefetchmaxpending = prefetchmaxpending;
	}

	/**
	* <pre>
	* The maximum number of outstanding prefetches in the IC.
	* </pre>
	*/
	public Long get_prefetchmaxpending() throws Exception {
		return this.prefetchmaxpending;
	}

	/**
	* <pre>
	* The bypass parameter. When this value is set to NO, an incoming request will serve a hit if a matching object is found in cache storage, regardless of the cacheability policy configuration. If set to YES, the bound request cacheability policies are evaluated before attempting any hit selection in the cache storage. If the request matches a policy with a NOCACHE action, the request will bypass all cache processing. This flag does not affect processing of requests that match any invalidation policy.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_enablebypass(String enablebypass) throws Exception{
		this.enablebypass = enablebypass;
	}

	/**
	* <pre>
	* The bypass parameter. When this value is set to NO, an incoming request will serve a hit if a matching object is found in cache storage, regardless of the cacheability policy configuration. If set to YES, the bound request cacheability policies are evaluated before attempting any hit selection in the cache storage. If the request matches a policy with a NOCACHE action, the request will bypass all cache processing. This flag does not affect processing of requests that match any invalidation policy.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_enablebypass() throws Exception {
		return this.enablebypass;
	}

	/**
	* <pre>
	* Set the default cache undef action. If an UNDEF event is triggered during policy evaluation and if the current policy's undefAction is not specified, then this global undefAction value is used. Can be NOCACHE or RESET. NOCACHE is the default value of default cache undef action.<br> Possible values = NOCACHE, RESET
	* </pre>
	*/
	public void set_undefaction(String undefaction) throws Exception{
		this.undefaction = undefaction;
	}

	/**
	* <pre>
	* Set the default cache undef action. If an UNDEF event is triggered during policy evaluation and if the current policy's undefAction is not specified, then this global undefAction value is used. Can be NOCACHE or RESET. NOCACHE is the default value of default cache undef action.<br> Possible values = NOCACHE, RESET
	* </pre>
	*/
	public String get_undefaction() throws Exception {
		return this.undefaction;
	}

	/**
	* <pre>
	* Active value of the memory limit for the Integrated Cache.
	* </pre>
	*/
	public Long get_memlimitactive() throws Exception {
		return this.memlimitactive;
	}

	/**
	* <pre>
	* The maximum value of the memory limit for the Integrated Cache.
	* </pre>
	*/
	public Long get_maxmemlimit() throws Exception {
		return this.maxmemlimit;
	}

	/**
	* <pre>
	* Number of current outstanding prefetches in the IC.
	* </pre>
	*/
	public Long get_prefetchcur() throws Exception {
		return this.prefetchcur;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		cacheparameter[] resources = new cacheparameter[1];
		cacheparameter_response result = (cacheparameter_response) service.get_payload_formatter().string_to_resource(cacheparameter_response.class, response);
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
		resources[0] = result.cacheparameter;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to update cacheparameter.
	*/
	public static base_response update(nitro_service client, cacheparameter resource) throws Exception {
		cacheparameter updateresource = new cacheparameter();
		updateresource.memlimit = resource.memlimit;
		updateresource.via = resource.via;
		updateresource.verifyusing = resource.verifyusing;
		updateresource.maxpostlen = resource.maxpostlen;
		updateresource.prefetchmaxpending = resource.prefetchmaxpending;
		updateresource.enablebypass = resource.enablebypass;
		updateresource.undefaction = resource.undefaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of cacheparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, cacheparameter resource, String[] args) throws Exception{
		cacheparameter unsetresource = new cacheparameter();
		unsetresource.memlimit = resource.memlimit;
		unsetresource.via = resource.via;
		unsetresource.verifyusing = resource.verifyusing;
		unsetresource.maxpostlen = resource.maxpostlen;
		unsetresource.prefetchmaxpending = resource.prefetchmaxpending;
		unsetresource.enablebypass = resource.enablebypass;
		unsetresource.undefaction = resource.undefaction;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the cacheparameter resources that are configured on netscaler.
	*/
	public static cacheparameter get(nitro_service service) throws Exception{
		cacheparameter obj = new cacheparameter();
		cacheparameter[] response = (cacheparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the cacheparameter resources that are configured on netscaler.
	*/
	public static cacheparameter get(nitro_service service,  options option) throws Exception{
		cacheparameter obj = new cacheparameter();
		cacheparameter[] response = (cacheparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class verifyusingEnum {
		public static final String HOSTNAME = "HOSTNAME";
		public static final String HOSTNAME_AND_IP = "HOSTNAME_AND_IP";
		public static final String DNS = "DNS";
	}
	public static class undefactionEnum {
		public static final String NOCACHE = "NOCACHE";
		public static final String RESET = "RESET";
	}
	public static class enablebypassEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
