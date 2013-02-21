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

class sslservicegroup_sslcertkey_binding_response extends base_response
{
	public sslservicegroup_sslcertkey_binding[] sslservicegroup_sslcertkey_binding;
}
/**
	* Binding class showing the sslcertkey that can be bound to sslservicegroup.
	*/

public class sslservicegroup_sslcertkey_binding extends base_resource
{
	private String certkeyname;
	private String crlcheck;
	private String ocspcheck;
	private Boolean ca;
	private Boolean snicert;
	private String servicegroupname;
	private Long __count;

	/**
	* <pre>
	* The name of the SSL service to which the SSL policy needs to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The name of the SSL service to which the SSL policy needs to be bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
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
	* The name of the certificate bound to the SSL service group.
	* </pre>
	*/
	public void set_certkeyname(String certkeyname) throws Exception{
		this.certkeyname = certkeyname;
	}

	/**
	* <pre>
	* The name of the certificate bound to the SSL service group.
	* </pre>
	*/
	public String get_certkeyname() throws Exception {
		return this.certkeyname;
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
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslservicegroup_sslcertkey_binding_response result = (sslservicegroup_sslcertkey_binding_response) service.get_payload_formatter().string_to_resource(sslservicegroup_sslcertkey_binding_response.class, response);
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
		return result.sslservicegroup_sslcertkey_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicegroupname;
	}

	public static base_response add(nitro_service client, sslservicegroup_sslcertkey_binding resource) throws Exception {
		sslservicegroup_sslcertkey_binding updateresource = new sslservicegroup_sslcertkey_binding();
		updateresource.servicegroupname = resource.servicegroupname;
		updateresource.certkeyname = resource.certkeyname;
		updateresource.ca = resource.ca;
		updateresource.crlcheck = resource.crlcheck;
		updateresource.snicert = resource.snicert;
		updateresource.ocspcheck = resource.ocspcheck;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, sslservicegroup_sslcertkey_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslservicegroup_sslcertkey_binding updateresources[] = new sslservicegroup_sslcertkey_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new sslservicegroup_sslcertkey_binding();
				updateresources[i].servicegroupname = resources[i].servicegroupname;
				updateresources[i].certkeyname = resources[i].certkeyname;
				updateresources[i].ca = resources[i].ca;
				updateresources[i].crlcheck = resources[i].crlcheck;
				updateresources[i].snicert = resources[i].snicert;
				updateresources[i].ocspcheck = resources[i].ocspcheck;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, sslservicegroup_sslcertkey_binding resource) throws Exception {
		sslservicegroup_sslcertkey_binding deleteresource = new sslservicegroup_sslcertkey_binding();
		deleteresource.servicegroupname = resource.servicegroupname;
		deleteresource.certkeyname = resource.certkeyname;
		deleteresource.ca = resource.ca;
		deleteresource.crlcheck = resource.crlcheck;
		deleteresource.snicert = resource.snicert;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, sslservicegroup_sslcertkey_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslservicegroup_sslcertkey_binding deleteresources[] = new sslservicegroup_sslcertkey_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslservicegroup_sslcertkey_binding();
				deleteresources[i].servicegroupname = resources[i].servicegroupname;
				deleteresources[i].certkeyname = resources[i].certkeyname;
				deleteresources[i].ca = resources[i].ca;
				deleteresources[i].crlcheck = resources[i].crlcheck;
				deleteresources[i].snicert = resources[i].snicert;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch sslservicegroup_sslcertkey_binding resources of given name .
	*/
	public static sslservicegroup_sslcertkey_binding[] get(nitro_service service, String servicegroupname) throws Exception{
		sslservicegroup_sslcertkey_binding obj = new sslservicegroup_sslcertkey_binding();
		obj.set_servicegroupname(servicegroupname);
		sslservicegroup_sslcertkey_binding response[] = (sslservicegroup_sslcertkey_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslservicegroup_sslcertkey_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslservicegroup_sslcertkey_binding[] get_filtered(nitro_service service, String servicegroupname, String filter) throws Exception{
		sslservicegroup_sslcertkey_binding obj = new sslservicegroup_sslcertkey_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_filter(filter);
		sslservicegroup_sslcertkey_binding[] response = (sslservicegroup_sslcertkey_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslservicegroup_sslcertkey_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslservicegroup_sslcertkey_binding[] get_filtered(nitro_service service, String servicegroupname, filtervalue[] filter) throws Exception{
		sslservicegroup_sslcertkey_binding obj = new sslservicegroup_sslcertkey_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_filter(filter);
		sslservicegroup_sslcertkey_binding[] response = (sslservicegroup_sslcertkey_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count sslservicegroup_sslcertkey_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String servicegroupname) throws Exception{
		sslservicegroup_sslcertkey_binding obj = new sslservicegroup_sslcertkey_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		sslservicegroup_sslcertkey_binding response[] = (sslservicegroup_sslcertkey_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslservicegroup_sslcertkey_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String servicegroupname, String filter) throws Exception{
		sslservicegroup_sslcertkey_binding obj = new sslservicegroup_sslcertkey_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslservicegroup_sslcertkey_binding[] response = (sslservicegroup_sslcertkey_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslservicegroup_sslcertkey_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String servicegroupname, filtervalue[] filter) throws Exception{
		sslservicegroup_sslcertkey_binding obj = new sslservicegroup_sslcertkey_binding();
		obj.set_servicegroupname(servicegroupname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslservicegroup_sslcertkey_binding[] response = (sslservicegroup_sslcertkey_binding[]) obj.getfiltered(service, option);
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

}