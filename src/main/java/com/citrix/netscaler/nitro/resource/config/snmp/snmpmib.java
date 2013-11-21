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

class snmpmib_response extends base_response
{
	public snmpmib snmpmib;
}
/**
* Configuration for SNMP mib resource.
*/

public class snmpmib extends base_resource
{
	private String contact;
	private String name;
	private String location;
	private String customid;

	//------- Read only Parameter ---------;

	private String sysdesc;
	private Long sysuptime;
	private Long sysservices;
	private String sysoid;

	/**
	* <pre>
	* Name of the administrator for this NetScaler appliance. Along with the name, you can include information on how to contact this person, such as a phone number or an email address. Can consist of 1 to 127 characters that include uppercase and  lowercase letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters.

The following requirement applies only to the NetScaler CLI:
If the information includes one or more spaces, enclose it in double or single quotation marks (for example, "my contact" or 'my contact').<br> Default value: "WebMaster (default)"<br> Minimum length =  1
	* </pre>
	*/
	public void set_contact(String contact) throws Exception{
		this.contact = contact;
	}

	/**
	* <pre>
	* Name of the administrator for this NetScaler appliance. Along with the name, you can include information on how to contact this person, such as a phone number or an email address. Can consist of 1 to 127 characters that include uppercase and  lowercase letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters.

The following requirement applies only to the NetScaler CLI:
If the information includes one or more spaces, enclose it in double or single quotation marks (for example, "my contact" or 'my contact').<br> Default value: "WebMaster (default)"<br> Minimum length =  1
	* </pre>
	*/
	public String get_contact() throws Exception {
		return this.contact;
	}

	/**
	* <pre>
	* Name for this NetScaler appliance. Can consist of 1 to 127 characters that include uppercase and lowercase letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters.  You should choose a name that helps identify the NetScaler appliance.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose it in double or single quotation marks (for example, "my name" or 'my name').<br> Default value: "NetScaler"<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for this NetScaler appliance. Can consist of 1 to 127 characters that include uppercase and lowercase letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters.  You should choose a name that helps identify the NetScaler appliance.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose it in double or single quotation marks (for example, "my name" or 'my name').<br> Default value: "NetScaler"<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Physical location of the NetScaler appliance. For example, you can specify building name, lab number, and rack number. Can consist of 1 to 127 characters that include uppercase and lowercase letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters.

The following requirement applies only to the NetScaler CLI:
If the location includes one or more spaces, enclose it in double or single quotation marks (for example, "my location" or 'my location').<br> Default value: "POP (default)"<br> Minimum length =  1
	* </pre>
	*/
	public void set_location(String location) throws Exception{
		this.location = location;
	}

	/**
	* <pre>
	* Physical location of the NetScaler appliance. For example, you can specify building name, lab number, and rack number. Can consist of 1 to 127 characters that include uppercase and lowercase letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters.

The following requirement applies only to the NetScaler CLI:
If the location includes one or more spaces, enclose it in double or single quotation marks (for example, "my location" or 'my location').<br> Default value: "POP (default)"<br> Minimum length =  1
	* </pre>
	*/
	public String get_location() throws Exception {
		return this.location;
	}

	/**
	* <pre>
	* Custom identification number for the NetScaler appliance. Can consist of 1 to 127 characters that include uppercase and lowercase letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters. You should choose a custom identification that helps identify the NetScaler appliance.

The following requirement applies only to the NetScaler CLI:
If the ID includes one or more spaces, enclose it in double or single quotation marks (for example, "my ID" or 'my ID').<br> Default value: "Default"<br> Minimum length =  1
	* </pre>
	*/
	public void set_customid(String customid) throws Exception{
		this.customid = customid;
	}

	/**
	* <pre>
	* Custom identification number for the NetScaler appliance. Can consist of 1 to 127 characters that include uppercase and lowercase letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) characters. You should choose a custom identification that helps identify the NetScaler appliance.

The following requirement applies only to the NetScaler CLI:
If the ID includes one or more spaces, enclose it in double or single quotation marks (for example, "my ID" or 'my ID').<br> Default value: "Default"<br> Minimum length =  1
	* </pre>
	*/
	public String get_customid() throws Exception {
		return this.customid;
	}

	/**
	* <pre>
	* The description of the system.
	* </pre>
	*/
	public String get_sysdesc() throws Exception {
		return this.sysdesc;
	}

	/**
	* <pre>
	* The UP time of the system in 100th of a second.
	* </pre>
	*/
	public Long get_sysuptime() throws Exception {
		return this.sysuptime;
	}

	/**
	* <pre>
	* The services offered by the system.
	* </pre>
	*/
	public Long get_sysservices() throws Exception {
		return this.sysservices;
	}

	/**
	* <pre>
	* The OID of the system's management system.
	* </pre>
	*/
	public String get_sysoid() throws Exception {
		return this.sysoid;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		snmpmib[] resources = new snmpmib[1];
		snmpmib_response result = (snmpmib_response) service.get_payload_formatter().string_to_resource(snmpmib_response.class, response);
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
		resources[0] = result.snmpmib;
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
	* Use this API to update snmpmib.
	*/
	public static base_response update(nitro_service client, snmpmib resource) throws Exception {
		snmpmib updateresource = new snmpmib();
		updateresource.contact = resource.contact;
		updateresource.name = resource.name;
		updateresource.location = resource.location;
		updateresource.customid = resource.customid;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of snmpmib resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, snmpmib resource, String[] args) throws Exception{
		snmpmib unsetresource = new snmpmib();
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the snmpmib resources that are configured on netscaler.
	*/
	public static snmpmib get(nitro_service service) throws Exception{
		snmpmib obj = new snmpmib();
		snmpmib[] response = (snmpmib[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the snmpmib resources that are configured on netscaler.
	*/
	public static snmpmib get(nitro_service service,  options option) throws Exception{
		snmpmib obj = new snmpmib();
		snmpmib[] response = (snmpmib[])obj.get_resources(service,option);
		return response[0];
	}

}
