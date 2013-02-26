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

class sslaction_response extends base_response
{
	public sslaction[] sslaction;
}
/**
* Configuration for SSL action resource.
*/

public class sslaction extends base_resource
{
	private String name;
	private String clientauth;
	private String clientcert;
	private String certheader;
	private String clientcertserialnumber;
	private String certserialheader;
	private String clientcertsubject;
	private String certsubjectheader;
	private String clientcerthash;
	private String certhashheader;
	private String clientcertissuer;
	private String certissuerheader;
	private String sessionid;
	private String sessionidheader;
	private String cipher;
	private String cipherheader;
	private String clientcertnotbefore;
	private String certnotbeforeheader;
	private String clientcertnotafter;
	private String certnotafterheader;
	private String owasupport;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long undefhits;
	private Long referencecount;
	private String description;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name for the new SSL action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new SSL action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Set action to do client certificate authentication or no authentication.
DOCLIENTAUTH: Perform client certificate authentication.
NOCLIENTAUTH: No client certificate authentication.<br> Possible values = DOCLIENTAUTH, NOCLIENTAUTH
	* </pre>
	*/
	public void set_clientauth(String clientauth) throws Exception{
		this.clientauth = clientauth;
	}

	/**
	* <pre>
	* Set action to do client certificate authentication or no authentication.
DOCLIENTAUTH: Perform client certificate authentication.
NOCLIENTAUTH: No client certificate authentication.<br> Possible values = DOCLIENTAUTH, NOCLIENTAUTH
	* </pre>
	*/
	public String get_clientauth() throws Exception {
		return this.clientauth;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_clientcert(String clientcert) throws Exception{
		this.clientcert = clientcert;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_clientcert() throws Exception {
		return this.clientcert;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the client certificate in the HTTP header.
	* </pre>
	*/
	public void set_certheader(String certheader) throws Exception{
		this.certheader = certheader;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the client certificate in the HTTP header.
	* </pre>
	*/
	public String get_certheader() throws Exception {
		return this.certheader;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate's Serial Number in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_clientcertserialnumber(String clientcertserialnumber) throws Exception{
		this.clientcertserialnumber = clientcertserialnumber;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate's Serial Number in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_clientcertserialnumber() throws Exception {
		return this.clientcertserialnumber;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the client certificate's Serial Number in the HTTP header.
	* </pre>
	*/
	public void set_certserialheader(String certserialheader) throws Exception{
		this.certserialheader = certserialheader;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the client certificate's Serial Number in the HTTP header.
	* </pre>
	*/
	public String get_certserialheader() throws Exception {
		return this.certserialheader;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate's Subject Name in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_clientcertsubject(String clientcertsubject) throws Exception{
		this.clientcertsubject = clientcertsubject;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate's Subject Name in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_clientcertsubject() throws Exception {
		return this.clientcertsubject;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the client certificate's Subject Name in the HTTP header.
	* </pre>
	*/
	public void set_certsubjectheader(String certsubjectheader) throws Exception{
		this.certsubjectheader = certsubjectheader;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the client certificate's Subject Name in the HTTP header.
	* </pre>
	*/
	public String get_certsubjectheader() throws Exception {
		return this.certsubjectheader;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate's hash (signature) in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_clientcerthash(String clientcerthash) throws Exception{
		this.clientcerthash = clientcerthash;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate's hash (signature) in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_clientcerthash() throws Exception {
		return this.clientcerthash;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the client certificate's hash (signature) in the HTTP header.
	* </pre>
	*/
	public void set_certhashheader(String certhashheader) throws Exception{
		this.certhashheader = certhashheader;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the client certificate's hash (signature) in the HTTP header.
	* </pre>
	*/
	public String get_certhashheader() throws Exception {
		return this.certhashheader;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate's Issuer Name in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_clientcertissuer(String clientcertissuer) throws Exception{
		this.clientcertissuer = clientcertissuer;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate's Issuer Name in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_clientcertissuer() throws Exception {
		return this.clientcertissuer;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the certificate's Issuer Name in the HTTP header.
	* </pre>
	*/
	public void set_certissuerheader(String certissuerheader) throws Exception{
		this.certissuerheader = certissuerheader;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the certificate's Issuer Name in the HTTP header.
	* </pre>
	*/
	public String get_certissuerheader() throws Exception {
		return this.certissuerheader;
	}

	/**
	* <pre>
	* The state of insertion of the Session-ID in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_sessionid(String sessionid) throws Exception{
		this.sessionid = sessionid;
	}

	/**
	* <pre>
	* The state of insertion of the Session-ID in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_sessionid() throws Exception {
		return this.sessionid;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the Session-ID in the HTTP header.
	* </pre>
	*/
	public void set_sessionidheader(String sessionidheader) throws Exception{
		this.sessionidheader = sessionidheader;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the Session-ID in the HTTP header.
	* </pre>
	*/
	public String get_sessionidheader() throws Exception {
		return this.sessionidheader;
	}

	/**
	* <pre>
	* The state of insertion of the cipher details in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cipher(String cipher) throws Exception{
		this.cipher = cipher;
	}

	/**
	* <pre>
	* The state of insertion of the cipher details in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cipher() throws Exception {
		return this.cipher;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the cipher details in the HTTP header.
	* </pre>
	*/
	public void set_cipherheader(String cipherheader) throws Exception{
		this.cipherheader = cipherheader;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the cipher details in the HTTP header.
	* </pre>
	*/
	public String get_cipherheader() throws Exception {
		return this.cipherheader;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate's Not-Before date in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_clientcertnotbefore(String clientcertnotbefore) throws Exception{
		this.clientcertnotbefore = clientcertnotbefore;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate's Not-Before date in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_clientcertnotbefore() throws Exception {
		return this.clientcertnotbefore;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the client certificate's Not-Before date in the HTTP header.
	* </pre>
	*/
	public void set_certnotbeforeheader(String certnotbeforeheader) throws Exception{
		this.certnotbeforeheader = certnotbeforeheader;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the client certificate's Not-Before date in the HTTP header.
	* </pre>
	*/
	public String get_certnotbeforeheader() throws Exception {
		return this.certnotbeforeheader;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate's Not-After in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_clientcertnotafter(String clientcertnotafter) throws Exception{
		this.clientcertnotafter = clientcertnotafter;
	}

	/**
	* <pre>
	* The state of insertion of the client certificate's Not-After in the HTTP header when the request is sent to the web-server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_clientcertnotafter() throws Exception {
		return this.clientcertnotafter;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the client certificate's Not-After date in the HTTP header.
	* </pre>
	*/
	public void set_certnotafterheader(String certnotafterheader) throws Exception{
		this.certnotafterheader = certnotafterheader;
	}

	/**
	* <pre>
	* The tag name to be used while inserting the client certificate's Not-After date in the HTTP header.
	* </pre>
	*/
	public String get_certnotafterheader() throws Exception {
		return this.certnotafterheader;
	}

	/**
	* <pre>
	* The  state  of  Outlook  Web-Access support. If the system is in front of an Outlook Web Access (OWA) server, a special header field, 'FRONT-END-HTTPS:  ON', needs to be inserted in the HTTP requests going to the OWA server.

Note: This  parameter is required as the SSL requests (HTTPS) arrives at the back-end Exchange-2000 server on the configured HTTP port (80) instead of arriving at the front-end Exchange 2000 server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_owasupport(String owasupport) throws Exception{
		this.owasupport = owasupport;
	}

	/**
	* <pre>
	* The  state  of  Outlook  Web-Access support. If the system is in front of an Outlook Web Access (OWA) server, a special header field, 'FRONT-END-HTTPS:  ON', needs to be inserted in the HTTP requests going to the OWA server.

Note: This  parameter is required as the SSL requests (HTTPS) arrives at the back-end Exchange-2000 server on the configured HTTP port (80) instead of arriving at the front-end Exchange 2000 server.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_owasupport() throws Exception {
		return this.owasupport;
	}

	/**
	* <pre>
	* The number of times the action has been taken.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The number of times the action resulted in UNDEF.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* The number of references to the action.
	* </pre>
	*/
	public Long get_referencecount() throws Exception {
		return this.referencecount;
	}

	/**
	* <pre>
	* Description of the action.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* Flag to determine whether ssl action is built-in or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		sslaction_response result = (sslaction_response) service.get_payload_formatter().string_to_resource(sslaction_response.class, response);
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
		return result.sslaction;
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
	* Use this API to add sslaction.
	*/
	public static base_response add(nitro_service client, sslaction resource) throws Exception {
		sslaction addresource = new sslaction();
		addresource.name = resource.name;
		addresource.clientauth = resource.clientauth;
		addresource.clientcert = resource.clientcert;
		addresource.certheader = resource.certheader;
		addresource.clientcertserialnumber = resource.clientcertserialnumber;
		addresource.certserialheader = resource.certserialheader;
		addresource.clientcertsubject = resource.clientcertsubject;
		addresource.certsubjectheader = resource.certsubjectheader;
		addresource.clientcerthash = resource.clientcerthash;
		addresource.certhashheader = resource.certhashheader;
		addresource.clientcertissuer = resource.clientcertissuer;
		addresource.certissuerheader = resource.certissuerheader;
		addresource.sessionid = resource.sessionid;
		addresource.sessionidheader = resource.sessionidheader;
		addresource.cipher = resource.cipher;
		addresource.cipherheader = resource.cipherheader;
		addresource.clientcertnotbefore = resource.clientcertnotbefore;
		addresource.certnotbeforeheader = resource.certnotbeforeheader;
		addresource.clientcertnotafter = resource.clientcertnotafter;
		addresource.certnotafterheader = resource.certnotafterheader;
		addresource.owasupport = resource.owasupport;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add sslaction resources.
	*/
	public static base_responses add(nitro_service client, sslaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslaction addresources[] = new sslaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new sslaction();
				addresources[i].name = resources[i].name;
				addresources[i].clientauth = resources[i].clientauth;
				addresources[i].clientcert = resources[i].clientcert;
				addresources[i].certheader = resources[i].certheader;
				addresources[i].clientcertserialnumber = resources[i].clientcertserialnumber;
				addresources[i].certserialheader = resources[i].certserialheader;
				addresources[i].clientcertsubject = resources[i].clientcertsubject;
				addresources[i].certsubjectheader = resources[i].certsubjectheader;
				addresources[i].clientcerthash = resources[i].clientcerthash;
				addresources[i].certhashheader = resources[i].certhashheader;
				addresources[i].clientcertissuer = resources[i].clientcertissuer;
				addresources[i].certissuerheader = resources[i].certissuerheader;
				addresources[i].sessionid = resources[i].sessionid;
				addresources[i].sessionidheader = resources[i].sessionidheader;
				addresources[i].cipher = resources[i].cipher;
				addresources[i].cipherheader = resources[i].cipherheader;
				addresources[i].clientcertnotbefore = resources[i].clientcertnotbefore;
				addresources[i].certnotbeforeheader = resources[i].certnotbeforeheader;
				addresources[i].clientcertnotafter = resources[i].clientcertnotafter;
				addresources[i].certnotafterheader = resources[i].certnotafterheader;
				addresources[i].owasupport = resources[i].owasupport;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		sslaction deleteresource = new sslaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslaction.
	*/
	public static base_response delete(nitro_service client, sslaction resource) throws Exception {
		sslaction deleteresource = new sslaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete sslaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			sslaction deleteresources[] = new sslaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new sslaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete sslaction resources.
	*/
	public static base_responses delete(nitro_service client, sslaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			sslaction deleteresources[] = new sslaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new sslaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the sslaction resources that are configured on netscaler.
	*/
	public static sslaction[] get(nitro_service service) throws Exception{
		sslaction obj = new sslaction();
		sslaction[] response = (sslaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the sslaction resources that are configured on netscaler.
	*/
	public static sslaction[] get(nitro_service service, options option) throws Exception{
		sslaction obj = new sslaction();
		sslaction[] response = (sslaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch sslaction resource of given name .
	*/
	public static sslaction get(nitro_service service, String name) throws Exception{
		sslaction obj = new sslaction();
		obj.set_name(name);
		sslaction response = (sslaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslaction resources of given names .
	*/
	public static sslaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			sslaction response[] = new sslaction[name.length];
			sslaction obj[] = new sslaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new sslaction();
				obj[i].set_name(name[i]);
				response[i] = (sslaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of sslaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static sslaction[] get_filtered(nitro_service service, String filter) throws Exception{
		sslaction obj = new sslaction();
		options option = new options();
		option.set_filter(filter);
		sslaction[] response = (sslaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of sslaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static sslaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslaction obj = new sslaction();
		options option = new options();
		option.set_filter(filter);
		sslaction[] response = (sslaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the sslaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		sslaction obj = new sslaction();
		options option = new options();
		option.set_count(true);
		sslaction[] response = (sslaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of sslaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		sslaction obj = new sslaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslaction[] response = (sslaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of sslaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		sslaction obj = new sslaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		sslaction[] response = (sslaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class clientcertnotafterEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
	public static class owasupportEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class clientcertsubjectEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class clientcertissuerEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class clientcertnotbeforeEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class clientcertserialnumberEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class cipherEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class clientcertEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class clientcerthashEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class clientauthEnum {
		public static final String DOCLIENTAUTH = "DOCLIENTAUTH";
		public static final String NOCLIENTAUTH = "NOCLIENTAUTH";
	}
	public static class sessionidEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
