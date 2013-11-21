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

class sslvserver_sslcertkey_binding_response extends base_response
{
	public sslvserver_sslcertkey_binding[] sslvserver_sslcertkey_binding;
}
/**
	* Binding class showing the sslcertkey that can be bound to sslvserver.
	*/

public class sslvserver_sslcertkey_binding extends base_resource
{
	private String certkeyname;
	private String crlcheck;
	private String ocspcheck;
	private Integer cleartextport;
	private Boolean ca;
	private Boolean snicert;
	private Boolean skipcaname;
	private String vservername;
	private Long __count;

	/**
	* <pre>
	* The name of the certificate key pair binding.
	* </pre>
	*/
	public void set_certkeyname(String certkeyname) throws Exception{
		this.certkeyname = certkeyname;
	}

	/**
	* <pre>
	* The name of the certificate key pair binding.
	* </pre>
	*/
	public String get_certkeyname() throws Exception {
		return this.certkeyname;
	}

	/**
	* <pre>
	* The flag is used to indicate whether this particular CA certificate's CA_Name needs to be sent to the SSL client while requesting for client certificate in a SSL handshake.
	* </pre>
	*/
	public void set_skipcaname(boolean skipcaname) throws Exception {
		this.skipcaname = new Boolean(skipcaname);
	}

	/**
	* <pre>
	* The flag is used to indicate whether this particular CA certificate's CA_Name needs to be sent to the SSL client while requesting for client certificate in a SSL handshake.
	* </pre>
	*/
	public void set_skipcaname(Boolean skipcaname) throws Exception{
		this.skipcaname = skipcaname;
	}

	/**
	* <pre>
	* The flag is used to indicate whether this particular CA certificate's CA_Name needs to be sent to the SSL client while requesting for client certificate in a SSL handshake.
	* </pre>
	*/
	public Boolean get_skipcaname() throws Exception {
		return this.skipcaname;
	}

	/**
	* <pre>
	* The name of the CertKey. Use this option to bind Certkey(s) which will be used in SNI processing.
	* </pre>
	*/
	public void set_snicert(boolean snicert) throws Exception {
		this.snicert = new Boolean(snicert);
	}

	/**
	* <pre>
	* The name of the CertKey. Use this option to bind Certkey(s) which will be used in SNI processing.
	* </pre>
	*/
	public void set_snicert(Boolean snicert) throws Exception{
		this.snicert = snicert;
	}

	/**
	* <pre>
	* The name of the CertKey. Use this option to bind Certkey(s) which will be used in SNI processing.
	* </pre>
	*/
	public Boolean get_snicert() throws Exception {
		return this.snicert;
	}

	/**
	* <pre>
	* The state of the OCSP check parameter. (Mandatory/Optional).<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public void set_ocspcheck(String ocspcheck) throws Exception{
		this.ocspcheck = ocspcheck;
	}

	/**
	* <pre>
	* The state of the OCSP check parameter. (Mandatory/Optional).<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public String get_ocspcheck() throws Exception {
		return this.ocspcheck;
	}

	/**
	* <pre>
	* CA certificate.
	* </pre>
	*/
	public void set_ca(boolean ca) throws Exception {
		this.ca = new Boolean(ca);
	}

	/**
	* <pre>
	* CA certificate.
	* </pre>
	*/
	public void set_ca(Boolean ca) throws Exception{
		this.ca = ca;
	}

	/**
	* <pre>
	* CA certificate.
	* </pre>
	*/
	public Boolean get_ca() throws Exception {
		return this.ca;
	}

	/**
	* <pre>
	* The state of the CRL check parameter. (Mandatory/Optional).<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public void set_crlcheck(String crlcheck) throws Exception{
		this.crlcheck = crlcheck;
	}

	/**
	* <pre>
	* The state of the CRL check parameter. (Mandatory/Optional).<br> Possible values = Mandatory, Optional
	* </pre>
	*/
	public String get_crlcheck() throws Exception {
		return this.crlcheck;
	}

	/**
	* <pre>
	* Name of the SSL virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_vservername(String vservername) throws Exception{
		this.vservername = vservername;
	}

	/**
	* <pre>
	* Name of the SSL virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_vservername() throws Exception {
		return this.vservername;
	}

	/**
	* <pre>
	* Port on which clear-text data is sent by the appliance to the server. Do not specify this parameter for SSL offloading with end-to-end encryption.
	* </pre>
	*/
	public Integer get_cleartextport() throws Exception {
		return this.cleartextport;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslvserver_sslcertkey_binding_response result = (sslvserver_sslcertkey_binding_response) service.get_payload_formatter().string_to_resource(sslvserver_sslcertkey_binding_response.class, response);
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
		return result.sslvserver_sslcertkey_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.vservername;
	}

	public static base_response add(nitro_service client, sslvserver_sslcertkey_binding resource) throws Exception {
		sslvserver_sslcertkey_binding updateresource = new sslvserver_sslcertkey_binding();
		updateresource.vservername = resource.vservername;
		updateresource.certkeyname = resource.certkeyname;
		updateresource.ca = resource.ca;
		updateresource.crlcheck = resource.crlcheck;
		updateresource.skipcaname = resource.skipcaname;
		updateresource.snicert = resource.snicert;
		updateresource.ocspcheck = resource.ocspcheck;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, sslvserver_sslcertkey_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslvserver_sslcertkey_binding updateresources[] = new sslvserver_sslcertkey_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslvserver_sslcertkey_binding();
				updateresources[i].vservername = resources[i].vservername;
				updateresources[i].certkeyname = resources[i].certkeyname;
				updateresources[i].ca = resources[i].ca;
				updateresources[i].crlcheck = resources[i].crlcheck;
				updateresources[i].skipcaname = resources[i].skipcaname;
				updateresources[i].snicert = resources[i].snicert;
				updateresources[i].ocspcheck = resources[i].ocspcheck;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, sslvserver_sslcertkey_binding resource) throws Exception {
		sslvserver_sslcertkey_binding deleteresource = new sslvserver_sslcertkey_binding();
		deleteresource.vservername = resource.vservername;
		deleteresource.certkeyname = resource.certkeyname;
		deleteresource.ca = resource.ca;
		deleteresource.crlcheck = resource.crlcheck;
		deleteresource.snicert = resource.snicert;
		deleteresource.ocspcheck = resource.ocspcheck;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, sslvserver_sslcertkey_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslvserver_sslcertkey_binding deleteresources[] = new sslvserver_sslcertkey_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslvserver_sslcertkey_binding();
				deleteresources[i].vservername = resources[i].vservername;
				deleteresources[i].certkeyname = resources[i].certkeyname;
				deleteresources[i].ca = resources[i].ca;
				deleteresources[i].crlcheck = resources[i].crlcheck;
				deleteresources[i].snicert = resources[i].snicert;
				deleteresources[i].ocspcheck = resources[i].ocspcheck;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch sslvserver_sslcertkey_binding resources of given name .
	*/
	public static sslvserver_sslcertkey_binding[] get(nitro_service service, String vservername) throws Exception{
		sslvserver_sslcertkey_binding obj = new sslvserver_sslcertkey_binding();
		obj.set_vservername(vservername);
		sslvserver_sslcertkey_binding response[] = (sslvserver_sslcertkey_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslvserver_sslcertkey_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslvserver_sslcertkey_binding[] get_filtered(nitro_service service, String vservername, String filter) throws Exception{
		sslvserver_sslcertkey_binding obj = new sslvserver_sslcertkey_binding();
		obj.set_vservername(vservername);
		options option = new options();
		option.set_filter(filter);
		sslvserver_sslcertkey_binding[] response = (sslvserver_sslcertkey_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslvserver_sslcertkey_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslvserver_sslcertkey_binding[] get_filtered(nitro_service service, String vservername, filtervalue[] filter) throws Exception{
		sslvserver_sslcertkey_binding obj = new sslvserver_sslcertkey_binding();
		obj.set_vservername(vservername);
		options option = new options();
		option.set_filter(filter);
		sslvserver_sslcertkey_binding[] response = (sslvserver_sslcertkey_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count sslvserver_sslcertkey_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String vservername) throws Exception{
		sslvserver_sslcertkey_binding obj = new sslvserver_sslcertkey_binding();
		obj.set_vservername(vservername);
		options option = new options();
		option.set_count(true);
		sslvserver_sslcertkey_binding response[] = (sslvserver_sslcertkey_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslvserver_sslcertkey_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String vservername, String filter) throws Exception{
		sslvserver_sslcertkey_binding obj = new sslvserver_sslcertkey_binding();
		obj.set_vservername(vservername);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslvserver_sslcertkey_binding[] response = (sslvserver_sslcertkey_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslvserver_sslcertkey_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String vservername, filtervalue[] filter) throws Exception{
		sslvserver_sslcertkey_binding obj = new sslvserver_sslcertkey_binding();
		obj.set_vservername(vservername);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslvserver_sslcertkey_binding[] response = (sslvserver_sslcertkey_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class ocspcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}
	public static class crlcheckEnum {
		public static final String Mandatory = "Mandatory";
		public static final String Optional = "Optional";
	}
	public static class labeltypeEnum {
		public static final String vserver = "vserver";
		public static final String service = "service";
		public static final String policylabel = "policylabel";
	}

}