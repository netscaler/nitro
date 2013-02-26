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

package com.citrix.netscaler.nitro.resource.config.ipsec;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ipsecparameter_response extends base_response
{
	public ipsecparameter ipsecparameter;
}
/**
* Configuration for IPSEC paramter resource.
*/

public class ipsecparameter extends base_resource
{
	private String[] encalgo;
	private String[] hashalgo;
	private Long lifetime;
	private Long livenesscheckinterval;
	private Long retransmissiontime;

	/**
	* <pre>
	* Type of encryption algorithm.<br> Default value: AES<br> Possible values = AES, 3DES
	* </pre>
	*/
	public void set_encalgo(String[] encalgo) throws Exception{
		this.encalgo = encalgo;
	}

	/**
	* <pre>
	* Type of encryption algorithm.<br> Default value: AES<br> Possible values = AES, 3DES
	* </pre>
	*/
	public String[] get_encalgo() throws Exception {
		return this.encalgo;
	}

	/**
	* <pre>
	* Type of hashing algorithm.<br> Default value: HMAC_SHA256<br> Possible values = HMAC_SHA1, HMAC_SHA256, HMAC_SHA384, HMAC_SHA512, HMAC_MD5
	* </pre>
	*/
	public void set_hashalgo(String[] hashalgo) throws Exception{
		this.hashalgo = hashalgo;
	}

	/**
	* <pre>
	* Type of hashing algorithm.<br> Default value: HMAC_SHA256<br> Possible values = HMAC_SHA1, HMAC_SHA256, HMAC_SHA384, HMAC_SHA512, HMAC_MD5
	* </pre>
	*/
	public String[] get_hashalgo() throws Exception {
		return this.hashalgo;
	}

	/**
	* <pre>
	* Lifetime of SA in seconds.<br> Minimum value =  60<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_lifetime(long lifetime) throws Exception {
		this.lifetime = new Long(lifetime);
	}

	/**
	* <pre>
	* Lifetime of SA in seconds.<br> Minimum value =  60<br> Maximum value =  31536000
	* </pre>
	*/
	public void set_lifetime(Long lifetime) throws Exception{
		this.lifetime = lifetime;
	}

	/**
	* <pre>
	* Lifetime of SA in seconds.<br> Minimum value =  60<br> Maximum value =  31536000
	* </pre>
	*/
	public Long get_lifetime() throws Exception {
		return this.lifetime;
	}

	/**
	* <pre>
	* Number of seconds after which a notify payload is sent to check the liveliness of the peer. Additional retries are done as per retransmit interval setting. Zero value disables liveliness checks.<br> Minimum value =  0<br> Maximum value =  64999
	* </pre>
	*/
	public void set_livenesscheckinterval(long livenesscheckinterval) throws Exception {
		this.livenesscheckinterval = new Long(livenesscheckinterval);
	}

	/**
	* <pre>
	* Number of seconds after which a notify payload is sent to check the liveliness of the peer. Additional retries are done as per retransmit interval setting. Zero value disables liveliness checks.<br> Minimum value =  0<br> Maximum value =  64999
	* </pre>
	*/
	public void set_livenesscheckinterval(Long livenesscheckinterval) throws Exception{
		this.livenesscheckinterval = livenesscheckinterval;
	}

	/**
	* <pre>
	* Number of seconds after which a notify payload is sent to check the liveliness of the peer. Additional retries are done as per retransmit interval setting. Zero value disables liveliness checks.<br> Minimum value =  0<br> Maximum value =  64999
	* </pre>
	*/
	public Long get_livenesscheckinterval() throws Exception {
		return this.livenesscheckinterval;
	}

	/**
	* <pre>
	* The interval in seconds to retry sending the IKE messages to peer, three consecutive attempts are done with doubled interval after every failure.,
increases for every retransmit till 6 retransmits. .<br> Minimum value =  1<br> Maximum value =  99
	* </pre>
	*/
	public void set_retransmissiontime(long retransmissiontime) throws Exception {
		this.retransmissiontime = new Long(retransmissiontime);
	}

	/**
	* <pre>
	* The interval in seconds to retry sending the IKE messages to peer, three consecutive attempts are done with doubled interval after every failure.,
increases for every retransmit till 6 retransmits. .<br> Minimum value =  1<br> Maximum value =  99
	* </pre>
	*/
	public void set_retransmissiontime(Long retransmissiontime) throws Exception{
		this.retransmissiontime = retransmissiontime;
	}

	/**
	* <pre>
	* The interval in seconds to retry sending the IKE messages to peer, three consecutive attempts are done with doubled interval after every failure.,
increases for every retransmit till 6 retransmits. .<br> Minimum value =  1<br> Maximum value =  99
	* </pre>
	*/
	public Long get_retransmissiontime() throws Exception {
		return this.retransmissiontime;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ipsecparameter[] resources = new ipsecparameter[1];
		ipsecparameter_response result = (ipsecparameter_response) service.get_payload_formatter().string_to_resource(ipsecparameter_response.class, response);
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
		resources[0] = result.ipsecparameter;
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
	* Use this API to update ipsecparameter.
	*/
	public static base_response update(nitro_service client, ipsecparameter resource) throws Exception {
		ipsecparameter updateresource = new ipsecparameter();
		updateresource.encalgo = resource.encalgo;
		updateresource.hashalgo = resource.hashalgo;
		updateresource.lifetime = resource.lifetime;
		updateresource.livenesscheckinterval = resource.livenesscheckinterval;
		updateresource.retransmissiontime = resource.retransmissiontime;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of ipsecparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, ipsecparameter resource, String[] args) throws Exception{
		ipsecparameter unsetresource = new ipsecparameter();
		unsetresource.encalgo = resource.encalgo;
		unsetresource.hashalgo = resource.hashalgo;
		unsetresource.lifetime = resource.lifetime;
		unsetresource.livenesscheckinterval = resource.livenesscheckinterval;
		unsetresource.retransmissiontime = resource.retransmissiontime;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the ipsecparameter resources that are configured on netscaler.
	*/
	public static ipsecparameter get(nitro_service service) throws Exception{
		ipsecparameter obj = new ipsecparameter();
		ipsecparameter[] response = (ipsecparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the ipsecparameter resources that are configured on netscaler.
	*/
	public static ipsecparameter get(nitro_service service,  options option) throws Exception{
		ipsecparameter obj = new ipsecparameter();
		ipsecparameter[] response = (ipsecparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class encalgoEnum {
		public static final String AES = "AES";
		public static final String _3DES = "3DES";
	}
	public static class hashalgoEnum {
		public static final String HMAC_SHA1 = "HMAC_SHA1";
		public static final String HMAC_SHA256 = "HMAC_SHA256";
		public static final String HMAC_SHA384 = "HMAC_SHA384";
		public static final String HMAC_SHA512 = "HMAC_SHA512";
		public static final String HMAC_MD5 = "HMAC_MD5";
	}
}
