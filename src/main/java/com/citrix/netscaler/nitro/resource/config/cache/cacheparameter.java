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
	private String enablediskcache;

	//------- Read only Parameter ---------;

	private Long memlimitactive;
	private Long maxmemlimit;
	private Long prefetchcur;

	/**
	* <pre>
	* Amount of memory available for storing the cache objects. In practice, the amount of memory available for caching can be less than half the total memory of the NetScaler appliance.
	* </pre>
	*/
	public void set_memlimit(long memlimit) throws Exception {
		this.memlimit = new Long(memlimit);
	}

	/**
	* <pre>
	* Amount of memory available for storing the cache objects. In practice, the amount of memory available for caching can be less than half the total memory of the NetScaler appliance.
	* </pre>
	*/
	public void set_memlimit(Long memlimit) throws Exception{
		this.memlimit = memlimit;
	}

	/**
	* <pre>
	* Amount of memory available for storing the cache objects. In practice, the amount of memory available for caching can be less than half the total memory of the NetScaler appliance.
	* </pre>
	*/
	public Long get_memlimit() throws Exception {
		return this.memlimit;
	}

	/**
	* <pre>
	* String to include in the Via header. A Via header is inserted into all responses served from a content group if its Insert Via flag is set.<br> Minimum length =  1
	* </pre>
	*/
	public void set_via(String via) throws Exception{
		this.via = via;
	}

	/**
	* <pre>
	* String to include in the Via header. A Via header is inserted into all responses served from a content group if its Insert Via flag is set.<br> Minimum length =  1
	* </pre>
	*/
	public String get_via() throws Exception {
		return this.via;
	}

	/**
	* <pre>
	* Criteria for deciding whether a cached object can be served for an incoming HTTP request. Available settings function as follows:
HOSTNAME - The URL, host name, and host port values in the incoming HTTP request header must match the cache policy. The IP address and the TCP port of the destination host are not evaluated. Do not use the HOSTNAME setting unless you are certain that no rogue client can access a rogue server through the cache. 
HOSTNAME_AND_IP - The URL, host name, host port in the incoming HTTP request header, and the IP address and TCP port of
the destination server, must match the cache policy.
DNS - The URL, host name and host port in the incoming HTTP request, and the TCP port must match the cache policy. The host name is used for DNS lookup of the destination server's IP address, and is compared with the set of addresses returned by the DNS lookup.<br> Possible values = HOSTNAME, HOSTNAME_AND_IP, DNS
	* </pre>
	*/
	public void set_verifyusing(String verifyusing) throws Exception{
		this.verifyusing = verifyusing;
	}

	/**
	* <pre>
	* Criteria for deciding whether a cached object can be served for an incoming HTTP request. Available settings function as follows:
HOSTNAME - The URL, host name, and host port values in the incoming HTTP request header must match the cache policy. The IP address and the TCP port of the destination host are not evaluated. Do not use the HOSTNAME setting unless you are certain that no rogue client can access a rogue server through the cache. 
HOSTNAME_AND_IP - The URL, host name, host port in the incoming HTTP request header, and the IP address and TCP port of
the destination server, must match the cache policy.
DNS - The URL, host name and host port in the incoming HTTP request, and the TCP port must match the cache policy. The host name is used for DNS lookup of the destination server's IP address, and is compared with the set of addresses returned by the DNS lookup.<br> Possible values = HOSTNAME, HOSTNAME_AND_IP, DNS
	* </pre>
	*/
	public String get_verifyusing() throws Exception {
		return this.verifyusing;
	}

	/**
	* <pre>
	* Maximum number of POST body bytes to consider when evaluating parameters for a content group for which you have configured hit parameters and invalidation parameters.<br> Default value: 4096<br> Minimum value =  0<br> Maximum value =  131072
	* </pre>
	*/
	public void set_maxpostlen(long maxpostlen) throws Exception {
		this.maxpostlen = new Long(maxpostlen);
	}

	/**
	* <pre>
	* Maximum number of POST body bytes to consider when evaluating parameters for a content group for which you have configured hit parameters and invalidation parameters.<br> Default value: 4096<br> Minimum value =  0<br> Maximum value =  131072
	* </pre>
	*/
	public void set_maxpostlen(Long maxpostlen) throws Exception{
		this.maxpostlen = maxpostlen;
	}

	/**
	* <pre>
	* Maximum number of POST body bytes to consider when evaluating parameters for a content group for which you have configured hit parameters and invalidation parameters.<br> Default value: 4096<br> Minimum value =  0<br> Maximum value =  131072
	* </pre>
	*/
	public Long get_maxpostlen() throws Exception {
		return this.maxpostlen;
	}

	/**
	* <pre>
	* Maximum number of outstanding prefetches in the Integrated Cache.
	* </pre>
	*/
	public void set_prefetchmaxpending(long prefetchmaxpending) throws Exception {
		this.prefetchmaxpending = new Long(prefetchmaxpending);
	}

	/**
	* <pre>
	* Maximum number of outstanding prefetches in the Integrated Cache.
	* </pre>
	*/
	public void set_prefetchmaxpending(Long prefetchmaxpending) throws Exception{
		this.prefetchmaxpending = prefetchmaxpending;
	}

	/**
	* <pre>
	* Maximum number of outstanding prefetches in the Integrated Cache.
	* </pre>
	*/
	public Long get_prefetchmaxpending() throws Exception {
		return this.prefetchmaxpending;
	}

	/**
	* <pre>
	* Evaluate the request-time policies before attempting hit selection. If set to NO, an incoming request for which a matching object is found in cache storage results in a response regardless of the policy configuration.
If the request matches a policy with a NOCACHE action, the request bypasses all cache processing. 
This parameter does not affect processing of requests that match any invalidation policy.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_enablebypass(String enablebypass) throws Exception{
		this.enablebypass = enablebypass;
	}

	/**
	* <pre>
	* Evaluate the request-time policies before attempting hit selection. If set to NO, an incoming request for which a matching object is found in cache storage results in a response regardless of the policy configuration.
If the request matches a policy with a NOCACHE action, the request bypasses all cache processing. 
This parameter does not affect processing of requests that match any invalidation policy.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_enablebypass() throws Exception {
		return this.enablebypass;
	}

	/**
	* <pre>
	* Action to take when a policy cannot be evaluated.<br> Possible values = NOCACHE, RESET
	* </pre>
	*/
	public void set_undefaction(String undefaction) throws Exception{
		this.undefaction = undefaction;
	}

	/**
	* <pre>
	* Action to take when a policy cannot be evaluated.<br> Possible values = NOCACHE, RESET
	* </pre>
	*/
	public String get_undefaction() throws Exception {
		return this.undefaction;
	}

	/**
	* <pre>
	* The disk cache parameter. When this value is set to YES, cache objects can be saved on disk.  If set to NO, objects will never be stored in disk.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_enablediskcache(String enablediskcache) throws Exception{
		this.enablediskcache = enablediskcache;
	}

	/**
	* <pre>
	* The disk cache parameter. When this value is set to YES, cache objects can be saved on disk.  If set to NO, objects will never be stored in disk.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_enablediskcache() throws Exception {
		return this.enablediskcache;
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
		updateresource.enablediskcache = resource.enablediskcache;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of cacheparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, cacheparameter resource, String[] args) throws Exception{
		cacheparameter unsetresource = new cacheparameter();
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

	public static class enablediskcacheEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
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
