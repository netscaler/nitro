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

class ipsecprofile_response extends base_response
{
	public ipsecprofile[] ipsecprofile;
}
/**
* Configuration for IPSEC profile resource.
*/

public class ipsecprofile extends base_resource
{
	private String name;
	private String[] encalgo;
	private String[] hashalgo;
	private Long lifetime;
	private String psk;
	private String publickey;
	private String privatekey;
	private String peerpublickey;
	private Long livenesscheckinterval;
	private Long retransmissiontime;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name of the ipsec profile.<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the ipsec profile.<br> Minimum length =  1<br> Maximum length =  32
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Type of encryption algorithm.<br> Possible values = AES, 3DES
	* </pre>
	*/
	public void set_encalgo(String[] encalgo) throws Exception{
		this.encalgo = encalgo;
	}

	/**
	* <pre>
	* Type of encryption algorithm.<br> Possible values = AES, 3DES
	* </pre>
	*/
	public String[] get_encalgo() throws Exception {
		return this.encalgo;
	}

	/**
	* <pre>
	* Type of hashing algorithm.<br> Possible values = HMAC_SHA1, HMAC_SHA256, HMAC_SHA384, HMAC_SHA512, HMAC_MD5
	* </pre>
	*/
	public void set_hashalgo(String[] hashalgo) throws Exception{
		this.hashalgo = hashalgo;
	}

	/**
	* <pre>
	* Type of hashing algorithm.<br> Possible values = HMAC_SHA1, HMAC_SHA256, HMAC_SHA384, HMAC_SHA512, HMAC_MD5
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
	* Pre shared key value.
	* </pre>
	*/
	public void set_psk(String psk) throws Exception{
		this.psk = psk;
	}

	/**
	* <pre>
	* Pre shared key value.
	* </pre>
	*/
	public String get_psk() throws Exception {
		return this.psk;
	}

	/**
	* <pre>
	* Public key file path.
	* </pre>
	*/
	public void set_publickey(String publickey) throws Exception{
		this.publickey = publickey;
	}

	/**
	* <pre>
	* Public key file path.
	* </pre>
	*/
	public String get_publickey() throws Exception {
		return this.publickey;
	}

	/**
	* <pre>
	* Private key file path.
	* </pre>
	*/
	public void set_privatekey(String privatekey) throws Exception{
		this.privatekey = privatekey;
	}

	/**
	* <pre>
	* Private key file path.
	* </pre>
	*/
	public String get_privatekey() throws Exception {
		return this.privatekey;
	}

	/**
	* <pre>
	* Peer public key file path.
	* </pre>
	*/
	public void set_peerpublickey(String peerpublickey) throws Exception{
		this.peerpublickey = peerpublickey;
	}

	/**
	* <pre>
	* Peer public key file path.
	* </pre>
	*/
	public String get_peerpublickey() throws Exception {
		return this.peerpublickey;
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
	* The interval in seconds to retry sending the IKE messages to peer, three consecutive attempts are done with doubled interval after every failure.<br> Minimum value =  1<br> Maximum value =  99
	* </pre>
	*/
	public void set_retransmissiontime(long retransmissiontime) throws Exception {
		this.retransmissiontime = new Long(retransmissiontime);
	}

	/**
	* <pre>
	* The interval in seconds to retry sending the IKE messages to peer, three consecutive attempts are done with doubled interval after every failure.<br> Minimum value =  1<br> Maximum value =  99
	* </pre>
	*/
	public void set_retransmissiontime(Long retransmissiontime) throws Exception{
		this.retransmissiontime = retransmissiontime;
	}

	/**
	* <pre>
	* The interval in seconds to retry sending the IKE messages to peer, three consecutive attempts are done with doubled interval after every failure.<br> Minimum value =  1<br> Maximum value =  99
	* </pre>
	*/
	public Long get_retransmissiontime() throws Exception {
		return this.retransmissiontime;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		ipsecprofile_response result = (ipsecprofile_response) service.get_payload_formatter().string_to_resource(ipsecprofile_response.class, response);
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
		return result.ipsecprofile;
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
	* Use this API to add ipsecprofile.
	*/
	public static base_response add(nitro_service client, ipsecprofile resource) throws Exception {
		ipsecprofile addresource = new ipsecprofile();
		addresource.name = resource.name;
		addresource.encalgo = resource.encalgo;
		addresource.hashalgo = resource.hashalgo;
		addresource.lifetime = resource.lifetime;
		addresource.psk = resource.psk;
		addresource.publickey = resource.publickey;
		addresource.privatekey = resource.privatekey;
		addresource.peerpublickey = resource.peerpublickey;
		addresource.livenesscheckinterval = resource.livenesscheckinterval;
		addresource.retransmissiontime = resource.retransmissiontime;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add ipsecprofile resources.
	*/
	public static base_responses add(nitro_service client, ipsecprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ipsecprofile addresources[] = new ipsecprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new ipsecprofile();
				addresources[i].name = resources[i].name;
				addresources[i].encalgo = resources[i].encalgo;
				addresources[i].hashalgo = resources[i].hashalgo;
				addresources[i].lifetime = resources[i].lifetime;
				addresources[i].psk = resources[i].psk;
				addresources[i].publickey = resources[i].publickey;
				addresources[i].privatekey = resources[i].privatekey;
				addresources[i].peerpublickey = resources[i].peerpublickey;
				addresources[i].livenesscheckinterval = resources[i].livenesscheckinterval;
				addresources[i].retransmissiontime = resources[i].retransmissiontime;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete ipsecprofile of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		ipsecprofile deleteresource = new ipsecprofile();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete ipsecprofile.
	*/
	public static base_response delete(nitro_service client, ipsecprofile resource) throws Exception {
		ipsecprofile deleteresource = new ipsecprofile();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete ipsecprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			ipsecprofile deleteresources[] = new ipsecprofile[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new ipsecprofile();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete ipsecprofile resources.
	*/
	public static base_responses delete(nitro_service client, ipsecprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ipsecprofile deleteresources[] = new ipsecprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new ipsecprofile();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the ipsecprofile resources that are configured on netscaler.
	*/
	public static ipsecprofile[] get(nitro_service service) throws Exception{
		ipsecprofile obj = new ipsecprofile();
		ipsecprofile[] response = (ipsecprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the ipsecprofile resources that are configured on netscaler.
	*/
	public static ipsecprofile[] get(nitro_service service, options option) throws Exception{
		ipsecprofile obj = new ipsecprofile();
		ipsecprofile[] response = (ipsecprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch ipsecprofile resource of given name .
	*/
	public static ipsecprofile get(nitro_service service, String name) throws Exception{
		ipsecprofile obj = new ipsecprofile();
		obj.set_name(name);
		ipsecprofile response = (ipsecprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch ipsecprofile resources of given names .
	*/
	public static ipsecprofile[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			ipsecprofile response[] = new ipsecprofile[name.length];
			ipsecprofile obj[] = new ipsecprofile[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new ipsecprofile();
				obj[i].set_name(name[i]);
				response[i] = (ipsecprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of ipsecprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static ipsecprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		ipsecprofile obj = new ipsecprofile();
		options option = new options();
		option.set_filter(filter);
		ipsecprofile[] response = (ipsecprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ipsecprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ipsecprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		ipsecprofile obj = new ipsecprofile();
		options option = new options();
		option.set_filter(filter);
		ipsecprofile[] response = (ipsecprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ipsecprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		ipsecprofile obj = new ipsecprofile();
		options option = new options();
		option.set_count(true);
		ipsecprofile[] response = (ipsecprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of ipsecprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		ipsecprofile obj = new ipsecprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ipsecprofile[] response = (ipsecprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of ipsecprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		ipsecprofile obj = new ipsecprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ipsecprofile[] response = (ipsecprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
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
