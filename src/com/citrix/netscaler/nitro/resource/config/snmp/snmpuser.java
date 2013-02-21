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

package com.citrix.netscaler.nitro.resource.config.snmp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class snmpuser_response extends base_response
{
	public snmpuser[] snmpuser;
}
/**
* Configuration for SNMP user resource.
*/

public class snmpuser extends base_resource
{
	private String name;
	private String group;
	private String authtype;
	private String authpasswd;
	private String privtype;
	private String privpasswd;

	//------- Read only Parameter ---------;

	private String engineid;
	private String storagetype;
	private String status;
	private Long __count;

	/**
	* <pre>
	* A name for the SNMP user. Can begin and consist of 1 to 31 characters that include letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters. .<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* A name for the SNMP user. Can begin and consist of 1 to 31 characters that include letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters. .<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The name of the configured SNMP group to which you want to bind this SNMP user. The access rights (bound SNMP views) and security level set for this group are associated to this user.  .<br> Minimum length =  1
	* </pre>
	*/
	public void set_group(String group) throws Exception{
		this.group = group;
	}

	/**
	* <pre>
	* The name of the configured SNMP group to which you want to bind this SNMP user. The access rights (bound SNMP views) and security level set for this group are associated to this user.  .<br> Minimum length =  1
	* </pre>
	*/
	public String get_group() throws Exception {
		return this.group;
	}

	/**
	* <pre>
	* The authentication algorithm used by the NetScaler appliance and the SNMP user for authenticating the communication between them. You must set the same authentication algorithm while configuring the SNMP user in the SNMP manager.<br> Possible values = MD5, SHA
	* </pre>
	*/
	public void set_authtype(String authtype) throws Exception{
		this.authtype = authtype;
	}

	/**
	* <pre>
	* The authentication algorithm used by the NetScaler appliance and the SNMP user for authenticating the communication between them. You must set the same authentication algorithm while configuring the SNMP user in the SNMP manager.<br> Possible values = MD5, SHA
	* </pre>
	*/
	public String get_authtype() throws Exception {
		return this.authtype;
	}

	/**
	* <pre>
	* A plain-text pass phrase to be used by the authentication algorithm specified by the authType (Authentication Type) parameter. 
Can begin and consist of 1 to 31 characters that include letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters. 
.<br> Minimum length =  8
	* </pre>
	*/
	public void set_authpasswd(String authpasswd) throws Exception{
		this.authpasswd = authpasswd;
	}

	/**
	* <pre>
	* A plain-text pass phrase to be used by the authentication algorithm specified by the authType (Authentication Type) parameter. 
Can begin and consist of 1 to 31 characters that include letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters. 
.<br> Minimum length =  8
	* </pre>
	*/
	public String get_authpasswd() throws Exception {
		return this.authpasswd;
	}

	/**
	* <pre>
	* The encryption algorithm used by the NetScaler appliance and the SNMP user for encrypting the communication between them. You must set the same encryption algorithm while configuring the SNMP user in the SNMP manager.<br> Possible values = DES, AES
	* </pre>
	*/
	public void set_privtype(String privtype) throws Exception{
		this.privtype = privtype;
	}

	/**
	* <pre>
	* The encryption algorithm used by the NetScaler appliance and the SNMP user for encrypting the communication between them. You must set the same encryption algorithm while configuring the SNMP user in the SNMP manager.<br> Possible values = DES, AES
	* </pre>
	*/
	public String get_privtype() throws Exception {
		return this.privtype;
	}

	/**
	* <pre>
	* An encryption key to be used by the encryption algorithm specified by in the privType (Encryption Type) parameter. Can begin and consist of 1 to 31 characters that include letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters.<br> Minimum length =  8
	* </pre>
	*/
	public void set_privpasswd(String privpasswd) throws Exception{
		this.privpasswd = privpasswd;
	}

	/**
	* <pre>
	* An encryption key to be used by the encryption algorithm specified by in the privType (Encryption Type) parameter. Can begin and consist of 1 to 31 characters that include letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters.<br> Minimum length =  8
	* </pre>
	*/
	public String get_privpasswd() throws Exception {
		return this.privpasswd;
	}

	/**
	* <pre>
	* The context engine ID of the user.
	* </pre>
	*/
	public String get_engineid() throws Exception {
		return this.engineid;
	}

	/**
	* <pre>
	* The storage type for this user.<br> Possible values = volatile, nonVolatile
	* </pre>
	*/
	public String get_storagetype() throws Exception {
		return this.storagetype;
	}

	/**
	* <pre>
	* The status of this user.<br> Possible values = active
	* </pre>
	*/
	public String get_status() throws Exception {
		return this.status;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		snmpuser_response result = (snmpuser_response) service.get_payload_formatter().string_to_resource(snmpuser_response.class, response);
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
		return result.snmpuser;
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
	* Use this API to add snmpuser.
	*/
	public static base_response add(nitro_service client, snmpuser resource) throws Exception {
		snmpuser addresource = new snmpuser();
		addresource.name = resource.name;
		addresource.group = resource.group;
		addresource.authtype = resource.authtype;
		addresource.authpasswd = resource.authpasswd;
		addresource.privtype = resource.privtype;
		addresource.privpasswd = resource.privpasswd;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add snmpuser resources.
	*/
	public static base_responses add(nitro_service client, snmpuser resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpuser addresources[] = new snmpuser[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new snmpuser();
				addresources[i].name = resources[i].name;
				addresources[i].group = resources[i].group;
				addresources[i].authtype = resources[i].authtype;
				addresources[i].authpasswd = resources[i].authpasswd;
				addresources[i].privtype = resources[i].privtype;
				addresources[i].privpasswd = resources[i].privpasswd;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmpuser of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		snmpuser deleteresource = new snmpuser();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmpuser.
	*/
	public static base_response delete(nitro_service client, snmpuser resource) throws Exception {
		snmpuser deleteresource = new snmpuser();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmpuser resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			snmpuser deleteresources[] = new snmpuser[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new snmpuser();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmpuser resources.
	*/
	public static base_responses delete(nitro_service client, snmpuser resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpuser deleteresources[] = new snmpuser[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new snmpuser();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update snmpuser.
	*/
	public static base_response update(nitro_service client, snmpuser resource) throws Exception {
		snmpuser updateresource = new snmpuser();
		updateresource.name = resource.name;
		updateresource.group = resource.group;
		updateresource.authtype = resource.authtype;
		updateresource.authpasswd = resource.authpasswd;
		updateresource.privtype = resource.privtype;
		updateresource.privpasswd = resource.privpasswd;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update snmpuser resources.
	*/
	public static base_responses update(nitro_service client, snmpuser resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpuser updateresources[] = new snmpuser[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new snmpuser();
				updateresources[i].name = resources[i].name;
				updateresources[i].group = resources[i].group;
				updateresources[i].authtype = resources[i].authtype;
				updateresources[i].authpasswd = resources[i].authpasswd;
				updateresources[i].privtype = resources[i].privtype;
				updateresources[i].privpasswd = resources[i].privpasswd;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of snmpuser resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		snmpuser unsetresource = new snmpuser();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of snmpuser resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, snmpuser resource, String[] args) throws Exception{
		snmpuser unsetresource = new snmpuser();
		unsetresource.name = resource.name;
		unsetresource.authtype = resource.authtype;
		unsetresource.privtype = resource.privtype;
		unsetresource.authpasswd = resource.authpasswd;
		unsetresource.privpasswd = resource.privpasswd;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of snmpuser resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			snmpuser unsetresources[] = new snmpuser[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new snmpuser();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of snmpuser resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, snmpuser resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmpuser unsetresources[] = new snmpuser[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new snmpuser();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].authtype = resources[i].authtype;
				unsetresources[i].privtype = resources[i].privtype;
				unsetresources[i].authpasswd = resources[i].authpasswd;
				unsetresources[i].privpasswd = resources[i].privpasswd;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the snmpuser resources that are configured on netscaler.
	*/
	public static snmpuser[] get(nitro_service service) throws Exception{
		snmpuser obj = new snmpuser();
		snmpuser[] response = (snmpuser[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the snmpuser resources that are configured on netscaler.
	*/
	public static snmpuser[] get(nitro_service service, options option) throws Exception{
		snmpuser obj = new snmpuser();
		snmpuser[] response = (snmpuser[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch snmpuser resource of given name .
	*/
	public static snmpuser get(nitro_service service, String name) throws Exception{
		snmpuser obj = new snmpuser();
		obj.set_name(name);
		snmpuser response = (snmpuser) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch snmpuser resources of given names .
	*/
	public static snmpuser[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			snmpuser response[] = new snmpuser[name.length];
			snmpuser obj[] = new snmpuser[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new snmpuser();
				obj[i].set_name(name[i]);
				response[i] = (snmpuser) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of snmpuser resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static snmpuser[] get_filtered(nitro_service service, String filter) throws Exception{
		snmpuser obj = new snmpuser();
		options option = new options();
		option.set_filter(filter);
		snmpuser[] response = (snmpuser[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmpuser resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmpuser[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpuser obj = new snmpuser();
		options option = new options();
		option.set_filter(filter);
		snmpuser[] response = (snmpuser[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmpuser resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		snmpuser obj = new snmpuser();
		options option = new options();
		option.set_count(true);
		snmpuser[] response = (snmpuser[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of snmpuser resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		snmpuser obj = new snmpuser();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpuser[] response = (snmpuser[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmpuser resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmpuser obj = new snmpuser();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmpuser[] response = (snmpuser[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class storagetypeEnum {
		public static final String Volatile = "volatile";
		public static final String nonVolatile = "nonVolatile";
	}
	public static class authtypeEnum {
		public static final String MD5 = "MD5";
		public static final String SHA = "SHA";
	}
	public static class statusEnum {
		public static final String active = "active";
	}
	public static class privtypeEnum {
		public static final String DES = "DES";
		public static final String AES = "AES";
	}
}
