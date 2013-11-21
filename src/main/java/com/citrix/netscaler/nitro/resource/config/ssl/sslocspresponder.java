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

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslocspresponder_response extends base_response
{
	public sslocspresponder[] sslocspresponder;
}
/**
* Configuration for OCSP responser resource.
*/

public class sslocspresponder extends base_resource
{
	private String name;
	private String url;
	private String cache;
	private Long cachetimeout;
	private Long batchingdepth;
	private Long batchingdelay;
	private Long resptimeout;
	private String respondercert;
	private Boolean trustresponder;
	private Long producedattimeskew;
	private String signingcert;
	private String usenonce;
	private String insertclientcert;

	//------- Read only Parameter ---------;

	private Boolean useaia;
	private String dns;
	private String ipaddress;
	private Long __count;

	/**
	* <pre>
	* Name for the OCSP responder. Cannot begin with a hash (#) or space character and must contain only ASCII alphanumeric, underscore (_), hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the responder is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my responder" or 'my responder').<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the OCSP responder. Cannot begin with a hash (#) or space character and must contain only ASCII alphanumeric, underscore (_), hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters. Cannot be changed after the responder is created.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my responder" or 'my responder').<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* URL of the OCSP responder.<br> Minimum length =  1
	* </pre>
	*/
	public void set_url(String url) throws Exception{
		this.url = url;
	}

	/**
	* <pre>
	* URL of the OCSP responder.<br> Minimum length =  1
	* </pre>
	*/
	public String get_url() throws Exception {
		return this.url;
	}

	/**
	* <pre>
	* Enable caching of responses. Caching of responses received from the OCSP responder enables faster responses to the clients and reduces the load on the OCSP responder.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cache(String cache) throws Exception{
		this.cache = cache;
	}

	/**
	* <pre>
	* Enable caching of responses. Caching of responses received from the OCSP responder enables faster responses to the clients and reduces the load on the OCSP responder.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cache() throws Exception {
		return this.cache;
	}

	/**
	* <pre>
	* Timeout for caching the OCSP response. After the timeout, the NetScaler sends a fresh request to the OCSP responder for the certificate status. If a timeout is not specified, the timeout provided in the OCSP response applies.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public void set_cachetimeout(long cachetimeout) throws Exception {
		this.cachetimeout = new Long(cachetimeout);
	}

	/**
	* <pre>
	* Timeout for caching the OCSP response. After the timeout, the NetScaler sends a fresh request to the OCSP responder for the certificate status. If a timeout is not specified, the timeout provided in the OCSP response applies.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public void set_cachetimeout(Long cachetimeout) throws Exception{
		this.cachetimeout = cachetimeout;
	}

	/**
	* <pre>
	* Timeout for caching the OCSP response. After the timeout, the NetScaler sends a fresh request to the OCSP responder for the certificate status. If a timeout is not specified, the timeout provided in the OCSP response applies.<br> Default value: 1<br> Minimum value =  1<br> Maximum value =  1440
	* </pre>
	*/
	public Long get_cachetimeout() throws Exception {
		return this.cachetimeout;
	}

	/**
	* <pre>
	* Number of client certificates to batch together into one OCSP request. Batching avoids overloading the OCSP responder. A value of 1 signifies that each request is queried independently. For a value greater than 1, specify a timeout (batching delay) to avoid inordinately delaying the processing of a single certificate.<br> Minimum value =  1<br> Maximum value =  8
	* </pre>
	*/
	public void set_batchingdepth(long batchingdepth) throws Exception {
		this.batchingdepth = new Long(batchingdepth);
	}

	/**
	* <pre>
	* Number of client certificates to batch together into one OCSP request. Batching avoids overloading the OCSP responder. A value of 1 signifies that each request is queried independently. For a value greater than 1, specify a timeout (batching delay) to avoid inordinately delaying the processing of a single certificate.<br> Minimum value =  1<br> Maximum value =  8
	* </pre>
	*/
	public void set_batchingdepth(Long batchingdepth) throws Exception{
		this.batchingdepth = batchingdepth;
	}

	/**
	* <pre>
	* Number of client certificates to batch together into one OCSP request. Batching avoids overloading the OCSP responder. A value of 1 signifies that each request is queried independently. For a value greater than 1, specify a timeout (batching delay) to avoid inordinately delaying the processing of a single certificate.<br> Minimum value =  1<br> Maximum value =  8
	* </pre>
	*/
	public Long get_batchingdepth() throws Exception {
		return this.batchingdepth;
	}

	/**
	* <pre>
	* Maximum time, in milliseconds, to wait to accumulate OCSP requests to batch.  Does not apply if the Batching Depth is 1.<br> Minimum value =  0<br> Maximum value =  10000
	* </pre>
	*/
	public void set_batchingdelay(long batchingdelay) throws Exception {
		this.batchingdelay = new Long(batchingdelay);
	}

	/**
	* <pre>
	* Maximum time, in milliseconds, to wait to accumulate OCSP requests to batch.  Does not apply if the Batching Depth is 1.<br> Minimum value =  0<br> Maximum value =  10000
	* </pre>
	*/
	public void set_batchingdelay(Long batchingdelay) throws Exception{
		this.batchingdelay = batchingdelay;
	}

	/**
	* <pre>
	* Maximum time, in milliseconds, to wait to accumulate OCSP requests to batch.  Does not apply if the Batching Depth is 1.<br> Minimum value =  0<br> Maximum value =  10000
	* </pre>
	*/
	public Long get_batchingdelay() throws Exception {
		return this.batchingdelay;
	}

	/**
	* <pre>
	* Time, in milliseconds, to wait for an OCSP response. When this time elapses, an error message appears or the transaction is forwarded, depending on the settings on the virtual server. Includes Batching Delay time.<br> Minimum value =  0<br> Maximum value =  120000
	* </pre>
	*/
	public void set_resptimeout(long resptimeout) throws Exception {
		this.resptimeout = new Long(resptimeout);
	}

	/**
	* <pre>
	* Time, in milliseconds, to wait for an OCSP response. When this time elapses, an error message appears or the transaction is forwarded, depending on the settings on the virtual server. Includes Batching Delay time.<br> Minimum value =  0<br> Maximum value =  120000
	* </pre>
	*/
	public void set_resptimeout(Long resptimeout) throws Exception{
		this.resptimeout = resptimeout;
	}

	/**
	* <pre>
	* Time, in milliseconds, to wait for an OCSP response. When this time elapses, an error message appears or the transaction is forwarded, depending on the settings on the virtual server. Includes Batching Delay time.<br> Minimum value =  0<br> Maximum value =  120000
	* </pre>
	*/
	public Long get_resptimeout() throws Exception {
		return this.resptimeout;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1
	* </pre>
	*/
	public void set_respondercert(String respondercert) throws Exception{
		this.respondercert = respondercert;
	}

	/**
	* <pre>
	* .<br> Minimum length =  1
	* </pre>
	*/
	public String get_respondercert() throws Exception {
		return this.respondercert;
	}

	/**
	* <pre>
	* A certificate to use to validate OCSP responses.  Alternatively, if -trustResponder is specified, no verification will be done on the reponse.  If both are omitted, only the response times (producedAt, lastUpdate, nextUpdate) will be verified.
	* </pre>
	*/
	public void set_trustresponder(boolean trustresponder) throws Exception {
		this.trustresponder = new Boolean(trustresponder);
	}

	/**
	* <pre>
	* A certificate to use to validate OCSP responses.  Alternatively, if -trustResponder is specified, no verification will be done on the reponse.  If both are omitted, only the response times (producedAt, lastUpdate, nextUpdate) will be verified.
	* </pre>
	*/
	public void set_trustresponder(Boolean trustresponder) throws Exception{
		this.trustresponder = trustresponder;
	}

	/**
	* <pre>
	* A certificate to use to validate OCSP responses.  Alternatively, if -trustResponder is specified, no verification will be done on the reponse.  If both are omitted, only the response times (producedAt, lastUpdate, nextUpdate) will be verified.
	* </pre>
	*/
	public Boolean get_trustresponder() throws Exception {
		return this.trustresponder;
	}

	/**
	* <pre>
	* Time, in seconds, for which the NetScaler waits before considering the response as invalid. The response is considered invalid if the Produced At time stamp in the OCSP response exceeds or precedes the current NetScaler clock time by the amount of time specified.<br> Default value: 300<br> Minimum value =  0<br> Maximum value =  86400
	* </pre>
	*/
	public void set_producedattimeskew(long producedattimeskew) throws Exception {
		this.producedattimeskew = new Long(producedattimeskew);
	}

	/**
	* <pre>
	* Time, in seconds, for which the NetScaler waits before considering the response as invalid. The response is considered invalid if the Produced At time stamp in the OCSP response exceeds or precedes the current NetScaler clock time by the amount of time specified.<br> Default value: 300<br> Minimum value =  0<br> Maximum value =  86400
	* </pre>
	*/
	public void set_producedattimeskew(Long producedattimeskew) throws Exception{
		this.producedattimeskew = producedattimeskew;
	}

	/**
	* <pre>
	* Time, in seconds, for which the NetScaler waits before considering the response as invalid. The response is considered invalid if the Produced At time stamp in the OCSP response exceeds or precedes the current NetScaler clock time by the amount of time specified.<br> Default value: 300<br> Minimum value =  0<br> Maximum value =  86400
	* </pre>
	*/
	public Long get_producedattimeskew() throws Exception {
		return this.producedattimeskew;
	}

	/**
	* <pre>
	* Certificate-key pair that is used to sign OCSP requests. If this parameter is not set, the requests are not signed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_signingcert(String signingcert) throws Exception{
		this.signingcert = signingcert;
	}

	/**
	* <pre>
	* Certificate-key pair that is used to sign OCSP requests. If this parameter is not set, the requests are not signed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_signingcert() throws Exception {
		return this.signingcert;
	}

	/**
	* <pre>
	* Enable the OCSP nonce extension, which is designed to prevent replay attacks.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_usenonce(String usenonce) throws Exception{
		this.usenonce = usenonce;
	}

	/**
	* <pre>
	* Enable the OCSP nonce extension, which is designed to prevent replay attacks.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_usenonce() throws Exception {
		return this.usenonce;
	}

	/**
	* <pre>
	* Include the complete client certificate in the OCSP request.<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_insertclientcert(String insertclientcert) throws Exception{
		this.insertclientcert = insertclientcert;
	}

	/**
	* <pre>
	* Include the complete client certificate in the OCSP request.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_insertclientcert() throws Exception {
		return this.insertclientcert;
	}

	/**
	* <pre>
	* Only use the URL present in the certificate.
	* </pre>
	*/
	public Boolean get_useaia() throws Exception {
		return this.useaia;
	}

	/**
	* <pre>
	* Was DNS resolution successful for a domain-based OCSP responder.
	* </pre>
	*/
	public String get_dns() throws Exception {
		return this.dns;
	}

	/**
	* <pre>
	* The IPv6 address of the ocsp responder.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslocspresponder_response result = (sslocspresponder_response) service.get_payload_formatter().string_to_resource(sslocspresponder_response.class, response);
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
		return result.sslocspresponder;
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
	* Use this API to add sslocspresponder.
	*/
	public static base_response add(nitro_service client, sslocspresponder resource) throws Exception {
		sslocspresponder addresource = new sslocspresponder();
		addresource.name = resource.name;
		addresource.url = resource.url;
		addresource.cache = resource.cache;
		addresource.cachetimeout = resource.cachetimeout;
		addresource.batchingdepth = resource.batchingdepth;
		addresource.batchingdelay = resource.batchingdelay;
		addresource.resptimeout = resource.resptimeout;
		addresource.respondercert = resource.respondercert;
		addresource.trustresponder = resource.trustresponder;
		addresource.producedattimeskew = resource.producedattimeskew;
		addresource.signingcert = resource.signingcert;
		addresource.usenonce = resource.usenonce;
		addresource.insertclientcert = resource.insertclientcert;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add sslocspresponder resources.
	*/
	public static base_responses add(nitro_service client, sslocspresponder resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslocspresponder addresources[] = new sslocspresponder[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new sslocspresponder();
				addresources[i].name = resources[i].name;
				addresources[i].url = resources[i].url;
				addresources[i].cache = resources[i].cache;
				addresources[i].cachetimeout = resources[i].cachetimeout;
				addresources[i].batchingdepth = resources[i].batchingdepth;
				addresources[i].batchingdelay = resources[i].batchingdelay;
				addresources[i].resptimeout = resources[i].resptimeout;
				addresources[i].respondercert = resources[i].respondercert;
				addresources[i].trustresponder = resources[i].trustresponder;
				addresources[i].producedattimeskew = resources[i].producedattimeskew;
				addresources[i].signingcert = resources[i].signingcert;
				addresources[i].usenonce = resources[i].usenonce;
				addresources[i].insertclientcert = resources[i].insertclientcert;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslocspresponder of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		sslocspresponder deleteresource = new sslocspresponder();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslocspresponder.
	*/
	public static base_response delete(nitro_service client, sslocspresponder resource) throws Exception {
		sslocspresponder deleteresource = new sslocspresponder();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslocspresponder resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			sslocspresponder deleteresources[] = new sslocspresponder[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new sslocspresponder();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslocspresponder resources.
	*/
	public static base_responses delete(nitro_service client, sslocspresponder resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslocspresponder deleteresources[] = new sslocspresponder[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslocspresponder();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update sslocspresponder.
	*/
	public static base_response update(nitro_service client, sslocspresponder resource) throws Exception {
		sslocspresponder updateresource = new sslocspresponder();
		updateresource.name = resource.name;
		updateresource.url = resource.url;
		updateresource.cache = resource.cache;
		updateresource.cachetimeout = resource.cachetimeout;
		updateresource.batchingdepth = resource.batchingdepth;
		updateresource.batchingdelay = resource.batchingdelay;
		updateresource.resptimeout = resource.resptimeout;
		updateresource.respondercert = resource.respondercert;
		updateresource.trustresponder = resource.trustresponder;
		updateresource.producedattimeskew = resource.producedattimeskew;
		updateresource.signingcert = resource.signingcert;
		updateresource.usenonce = resource.usenonce;
		updateresource.insertclientcert = resource.insertclientcert;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update sslocspresponder resources.
	*/
	public static base_responses update(nitro_service client, sslocspresponder resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslocspresponder updateresources[] = new sslocspresponder[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslocspresponder();
				updateresources[i].name = resources[i].name;
				updateresources[i].url = resources[i].url;
				updateresources[i].cache = resources[i].cache;
				updateresources[i].cachetimeout = resources[i].cachetimeout;
				updateresources[i].batchingdepth = resources[i].batchingdepth;
				updateresources[i].batchingdelay = resources[i].batchingdelay;
				updateresources[i].resptimeout = resources[i].resptimeout;
				updateresources[i].respondercert = resources[i].respondercert;
				updateresources[i].trustresponder = resources[i].trustresponder;
				updateresources[i].producedattimeskew = resources[i].producedattimeskew;
				updateresources[i].signingcert = resources[i].signingcert;
				updateresources[i].usenonce = resources[i].usenonce;
				updateresources[i].insertclientcert = resources[i].insertclientcert;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslocspresponder resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		sslocspresponder unsetresource = new sslocspresponder();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of sslocspresponder resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, sslocspresponder resource, String[] args) throws Exception{
		sslocspresponder unsetresource = new sslocspresponder();
		unsetresource.name = resource.name;
		unsetresource.insertclientcert = resource.insertclientcert;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of sslocspresponder resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			sslocspresponder unsetresources[] = new sslocspresponder[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new sslocspresponder();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of sslocspresponder resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, sslocspresponder resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslocspresponder unsetresources[] = new sslocspresponder[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new sslocspresponder();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].insertclientcert = resources[i].insertclientcert;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the sslocspresponder resources that are configured on netscaler.
	*/
	public static sslocspresponder[] get(nitro_service service) throws Exception{
		sslocspresponder obj = new sslocspresponder();
		sslocspresponder[] response = (sslocspresponder[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslocspresponder resources that are configured on netscaler.
	*/
	public static sslocspresponder[] get(nitro_service service, options option) throws Exception{
		sslocspresponder obj = new sslocspresponder();
		sslocspresponder[] response = (sslocspresponder[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch sslocspresponder resource of given name .
	*/
	public static sslocspresponder get(nitro_service service, String name) throws Exception{
		sslocspresponder obj = new sslocspresponder();
		obj.set_name(name);
		sslocspresponder response = (sslocspresponder) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslocspresponder resources of given names .
	*/
	public static sslocspresponder[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			sslocspresponder response[] = new sslocspresponder[name.length];
			sslocspresponder obj[] = new sslocspresponder[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new sslocspresponder();
				obj[i].set_name(name[i]);
				response[i] = (sslocspresponder) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of sslocspresponder resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslocspresponder[] get_filtered(nitro_service service, String filter) throws Exception{
		sslocspresponder obj = new sslocspresponder();
		options option = new options();
		option.set_filter(filter);
		sslocspresponder[] response = (sslocspresponder[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslocspresponder resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslocspresponder[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslocspresponder obj = new sslocspresponder();
		options option = new options();
		option.set_filter(filter);
		sslocspresponder[] response = (sslocspresponder[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslocspresponder resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslocspresponder obj = new sslocspresponder();
		options option = new options();
		option.set_count(true);
		sslocspresponder[] response = (sslocspresponder[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslocspresponder resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslocspresponder obj = new sslocspresponder();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslocspresponder[] response = (sslocspresponder[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslocspresponder resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslocspresponder obj = new sslocspresponder();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslocspresponder[] response = (sslocspresponder[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class insertclientcertEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class usenonceEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class cacheEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
