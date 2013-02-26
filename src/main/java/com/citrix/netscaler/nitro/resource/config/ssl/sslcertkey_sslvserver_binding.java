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

class sslcertkey_sslvserver_binding_response extends base_response
{
	public sslcertkey_sslvserver_binding[] sslcertkey_sslvserver_binding;
}
/**
	* Binding class showing the sslvserver that can be bound to sslcertkey.
	*/

public class sslcertkey_sslvserver_binding extends base_resource
{
	private String servername;
	private Long data;
	private Integer version;
	private String certkey;
	private String vservername;
	private Boolean vserver;
	private Boolean ca;
	private String crlcheck;
	private Long __count;

	/**
	* <pre>
	* Specify this option to bind the certificate to an SSL virtual server.
	Note: The default option is -vServer.
	* </pre>
	*/
	public void set_vserver(boolean vserver) throws Exception {
		this.vserver = new Boolean(vserver);
	}

	/**
	* <pre>
	* Specify this option to bind the certificate to an SSL virtual server.
	Note: The default option is -vServer.
	* </pre>
	*/
	public void set_vserver(Boolean vserver) throws Exception{
		this.vserver = vserver;
	}

	/**
	* <pre>
	* Specify this option to bind the certificate to an SSL virtual server.
	Note: The default option is -vServer.
	* </pre>
	*/
	public Boolean get_vserver() throws Exception {
		return this.vserver;
	}

	/**
	* <pre>
	* The rule for use of CRL corresponding to this CA certificate during client authentication. If crlCheck is set to Mandatory, the system will deny all SSL clients if the CRL is missing, expired - NextUpdate date is in the past, or is incomplete with remote CRL refresh enabled. If crlCheck is set to optional, the system will allow SSL clients in the above error cases.However, in any case if the client certificate is revoked in the CRL, the SSL client will be denied access.<br> Default value: CRLCHECK_OPTIONAL<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public void set_crlcheck(String crlcheck) throws Exception{
		this.crlcheck = crlcheck;
	}

	/**
	* <pre>
	* The rule for use of CRL corresponding to this CA certificate during client authentication. If crlCheck is set to Mandatory, the system will deny all SSL clients if the CRL is missing, expired - NextUpdate date is in the past, or is incomplete with remote CRL refresh enabled. If crlCheck is set to optional, the system will allow SSL clients in the above error cases.However, in any case if the client certificate is revoked in the CRL, the SSL client will be denied access.<br> Default value: CRLCHECK_OPTIONAL<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public String get_crlcheck() throws Exception {
		return this.crlcheck;
	}

	/**
	* <pre>
	* If this option is specified, it indicates that the certificate-key pair being bound to the SSL virtual server is a CA certificate. If this option is not specified, the certificate-key pair is bound as a normal server certificate.

	Note: In case of a normal server certificate, the certificate-key pair should consist of both the certificate and the private-key.
	* </pre>
	*/
	public void set_ca(boolean ca) throws Exception {
		this.ca = new Boolean(ca);
	}

	/**
	* <pre>
	* If this option is specified, it indicates that the certificate-key pair being bound to the SSL virtual server is a CA certificate. If this option is not specified, the certificate-key pair is bound as a normal server certificate.

	Note: In case of a normal server certificate, the certificate-key pair should consist of both the certificate and the private-key.
	* </pre>
	*/
	public void set_ca(Boolean ca) throws Exception{
		this.ca = ca;
	}

	/**
	* <pre>
	* If this option is specified, it indicates that the certificate-key pair being bound to the SSL virtual server is a CA certificate. If this option is not specified, the certificate-key pair is bound as a normal server certificate.

	Note: In case of a normal server certificate, the certificate-key pair should consist of both the certificate and the private-key.
	* </pre>
	*/
	public Boolean get_ca() throws Exception {
		return this.ca;
	}

	/**
	* <pre>
	* The name of the SSL virtual server name to which the certificate-key pair needs to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_vservername(String vservername) throws Exception{
		this.vservername = vservername;
	}

	/**
	* <pre>
	* The name of the SSL virtual server name to which the certificate-key pair needs to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* Vserver name to which the certificate key pair is bound.
	* </pre>
	*/
	public void set_servername(String servername) throws Exception{
		this.servername = servername;
	}

	/**
	* <pre>
	* Vserver name to which the certificate key pair is bound.
	* </pre>
	*/
	public String get_servername() throws Exception {
		return this.servername;
	}

	/**
	* <pre>
	* The object name for the certificate-key pair.<br> Minimum length =  1
	* </pre>
	*/
	public void set_certkey(String certkey) throws Exception{
		this.certkey = certkey;
	}

	/**
	* <pre>
	* The object name for the certificate-key pair.<br> Minimum length =  1
	* </pre>
	*/
	public String get_certkey() throws Exception {
		return this.certkey;
	}

	/**
	* <pre>
	* Version.
	* </pre>
	*/
	public Integer get_version() throws Exception {
		return this.version;
	}

	/**
	* <pre>
	* Vserver Id.
	* </pre>
	*/
	public Long get_data() throws Exception {
		return this.data;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslcertkey_sslvserver_binding_response result = (sslcertkey_sslvserver_binding_response) service.get_payload_formatter().string_to_resource(sslcertkey_sslvserver_binding_response.class, response);
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
		return result.sslcertkey_sslvserver_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.certkey;
	}

	/**
	* Use this API to fetch sslcertkey_sslvserver_binding resources of given name .
	*/
	public static sslcertkey_sslvserver_binding[] get(nitro_service service, String certkey) throws Exception{
		sslcertkey_sslvserver_binding obj = new sslcertkey_sslvserver_binding();
		obj.set_certkey(certkey);
		sslcertkey_sslvserver_binding response[] = (sslcertkey_sslvserver_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslcertkey_sslvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslcertkey_sslvserver_binding[] get_filtered(nitro_service service, String certkey, String filter) throws Exception{
		sslcertkey_sslvserver_binding obj = new sslcertkey_sslvserver_binding();
		obj.set_certkey(certkey);
		options option = new options();
		option.set_filter(filter);
		sslcertkey_sslvserver_binding[] response = (sslcertkey_sslvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslcertkey_sslvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslcertkey_sslvserver_binding[] get_filtered(nitro_service service, String certkey, filtervalue[] filter) throws Exception{
		sslcertkey_sslvserver_binding obj = new sslcertkey_sslvserver_binding();
		obj.set_certkey(certkey);
		options option = new options();
		option.set_filter(filter);
		sslcertkey_sslvserver_binding[] response = (sslcertkey_sslvserver_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count sslcertkey_sslvserver_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String certkey) throws Exception{
		sslcertkey_sslvserver_binding obj = new sslcertkey_sslvserver_binding();
		obj.set_certkey(certkey);
		options option = new options();
		option.set_count(true);
		sslcertkey_sslvserver_binding response[] = (sslcertkey_sslvserver_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslcertkey_sslvserver_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String certkey, String filter) throws Exception{
		sslcertkey_sslvserver_binding obj = new sslcertkey_sslvserver_binding();
		obj.set_certkey(certkey);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcertkey_sslvserver_binding[] response = (sslcertkey_sslvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslcertkey_sslvserver_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String certkey, filtervalue[] filter) throws Exception{
		sslcertkey_sslvserver_binding obj = new sslcertkey_sslvserver_binding();
		obj.set_certkey(certkey);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslcertkey_sslvserver_binding[] response = (sslcertkey_sslvserver_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class crlcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}

}