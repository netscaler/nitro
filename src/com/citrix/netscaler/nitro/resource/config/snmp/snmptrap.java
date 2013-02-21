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

class snmptrap_response extends base_response
{
	public snmptrap[] snmptrap;
}
/**
* Configuration for snmp trap resource.
*/

public class snmptrap extends base_resource
{
	private String trapclass;
	private String trapdestination;
	private String version;
	private Integer destport;
	private String communityname;
	private String srcip;
	private String severity;
	private Long __count;

	/**
	* <pre>
	* The type of trap messages that you want the NetScaler appliance to send to this trap listener. There are two types:

Generic. Send standard system SNMP traps messages, such as authenticationfailure, linkDown, linkUp, and, coldStart traps, to the trap listener. 

Specific. Send enterprise specific trap messages to the trap listener. The MIB file of the NetScaler appliance contains the definitions of all the enterprise specific traps. For more information about the enterprise specific traps, see the SNMP OID reference guide for this release of the NetScaler software.<br> Possible values = generic, specific
	* </pre>
	*/
	public void set_trapclass(String trapclass) throws Exception{
		this.trapclass = trapclass;
	}

	/**
	* <pre>
	* The type of trap messages that you want the NetScaler appliance to send to this trap listener. There are two types:

Generic. Send standard system SNMP traps messages, such as authenticationfailure, linkDown, linkUp, and, coldStart traps, to the trap listener. 

Specific. Send enterprise specific trap messages to the trap listener. The MIB file of the NetScaler appliance contains the definitions of all the enterprise specific traps. For more information about the enterprise specific traps, see the SNMP OID reference guide for this release of the NetScaler software.<br> Possible values = generic, specific
	* </pre>
	*/
	public String get_trapclass() throws Exception {
		return this.trapclass;
	}

	/**
	* <pre>
	* The IPv4 or the IPv6 address of the trap listener to which you want the NetScaler appliance to send the SNMP trap messages.<br> Minimum length =  1
	* </pre>
	*/
	public void set_trapdestination(String trapdestination) throws Exception{
		this.trapdestination = trapdestination;
	}

	/**
	* <pre>
	* The IPv4 or the IPv6 address of the trap listener to which you want the NetScaler appliance to send the SNMP trap messages.<br> Minimum length =  1
	* </pre>
	*/
	public String get_trapdestination() throws Exception {
		return this.trapdestination;
	}

	/**
	* <pre>
	* The SNMP version, which determines the format of trap messages received by this trap listener.  .<br> Default value: TRAP_VERSION_2<br> Possible values = V1, V2
	* </pre>
	*/
	public void set_version(String version) throws Exception{
		this.version = version;
	}

	/**
	* <pre>
	* The SNMP version, which determines the format of trap messages received by this trap listener.  .<br> Default value: TRAP_VERSION_2<br> Possible values = V1, V2
	* </pre>
	*/
	public String get_version() throws Exception {
		return this.version;
	}

	/**
	* <pre>
	* The UDP port of this trap listener to which the NetScaler appliance send the SNMP trap messages. You must specify the same port number on the trap listener device. Otherwise, the trap listener drops the trap messages.<br> Default value: 162<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public void set_destport(int destport) throws Exception {
		this.destport = new Integer(destport);
	}

	/**
	* <pre>
	* The UDP port of this trap listener to which the NetScaler appliance send the SNMP trap messages. You must specify the same port number on the trap listener device. Otherwise, the trap listener drops the trap messages.<br> Default value: 162<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public void set_destport(Integer destport) throws Exception{
		this.destport = destport;
	}

	/**
	* <pre>
	* The UDP port of this trap listener to which the NetScaler appliance send the SNMP trap messages. You must specify the same port number on the trap listener device. Otherwise, the trap listener drops the trap messages.<br> Default value: 162<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public Integer get_destport() throws Exception {
		return this.destport;
	}

	/**
	* <pre>
	* A password (string) sent with the traps messages, which is used to authenticate the trap messages on the trap listener. Can consist of 1 to 31 characters that include letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) symbols.  You must specify the same community string on the trap listener device. Otherwise, the trap listener drops the trap messages.<br> Default value: "public"<br> Minimum length =  1
	* </pre>
	*/
	public void set_communityname(String communityname) throws Exception{
		this.communityname = communityname;
	}

	/**
	* <pre>
	* A password (string) sent with the traps messages, which is used to authenticate the trap messages on the trap listener. Can consist of 1 to 31 characters that include letters, numbers, and the hyphen (-), period (.) pound (#), space ( ), at sign (@), equals (=), colon (:), and underscore (_) symbols.  You must specify the same community string on the trap listener device. Otherwise, the trap listener drops the trap messages.<br> Default value: "public"<br> Minimum length =  1
	* </pre>
	*/
	public String get_communityname() throws Exception {
		return this.communityname;
	}

	/**
	* <pre>
	* The IPv4 or IPv6 address that the NetScaler appliance inserts as the source IP address in all SNMP trap messages that it sends to this trap listener. 
 
For a trap listener that has an IPv4 address, you can set the source IP to either a mapped IP (MIP) address or a subnet IP (SNIP) address configured on the NetScaler appliance. By default, the appliance uses the NSIP address as the source IP address.  For a trap listener that has an IPv6 address, you can set the source IP address to any subnet IPv6 (SNIP6) address configured on the appliance. By default, the appliance uses the NSIP6 address as the source IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_srcip(String srcip) throws Exception{
		this.srcip = srcip;
	}

	/**
	* <pre>
	* The IPv4 or IPv6 address that the NetScaler appliance inserts as the source IP address in all SNMP trap messages that it sends to this trap listener. 
 
For a trap listener that has an IPv4 address, you can set the source IP to either a mapped IP (MIP) address or a subnet IP (SNIP) address configured on the NetScaler appliance. By default, the appliance uses the NSIP address as the source IP address.  For a trap listener that has an IPv6 address, you can set the source IP address to any subnet IPv6 (SNIP6) address configured on the appliance. By default, the appliance uses the NSIP6 address as the source IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_srcip() throws Exception {
		return this.srcip;
	}

	/**
	* <pre>
	* The severity level at or above which the NetScaler appliance sends trap messages to this trap listener. Following are the severity levels defined on the NetScaler appliance, in increasing order of severity.
 - Informational
 - Warning
 - Minor
 - Major
 - Critical

For example, if you set the severity level as Minor, all trap messages with a severity level of Minor, Major, or Critical are sent to the trap listener. 

This parameter can only be set for specific trap listeners. By default, all levels of generated SNMP traps messages are sent to a trap listener. 

Important: Trap messages are not assigned severity levels unless you specify severity levels when configuring SNMP alarms. For example, if you specify a severity level as Warning for the SNMP alarm named LOGIN-FAILURE, a trap message generated as a result of login failure is assigned the Warning severity level.<br> Default value: SNMP_SEV_UNKNOWN<br> Possible values = Critical, Major, Minor, Warning, Informational
	* </pre>
	*/
	public void set_severity(String severity) throws Exception{
		this.severity = severity;
	}

	/**
	* <pre>
	* The severity level at or above which the NetScaler appliance sends trap messages to this trap listener. Following are the severity levels defined on the NetScaler appliance, in increasing order of severity.
 - Informational
 - Warning
 - Minor
 - Major
 - Critical

For example, if you set the severity level as Minor, all trap messages with a severity level of Minor, Major, or Critical are sent to the trap listener. 

This parameter can only be set for specific trap listeners. By default, all levels of generated SNMP traps messages are sent to a trap listener. 

Important: Trap messages are not assigned severity levels unless you specify severity levels when configuring SNMP alarms. For example, if you specify a severity level as Warning for the SNMP alarm named LOGIN-FAILURE, a trap message generated as a result of login failure is assigned the Warning severity level.<br> Default value: SNMP_SEV_UNKNOWN<br> Possible values = Critical, Major, Minor, Warning, Informational
	* </pre>
	*/
	public String get_severity() throws Exception {
		return this.severity;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		snmptrap_response result = (snmptrap_response) service.get_payload_formatter().string_to_resource(snmptrap_response.class, response);
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
		return result.snmptrap;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.trapclass;
	}

	/**
	* Use this API to add snmptrap.
	*/
	public static base_response add(nitro_service client, snmptrap resource) throws Exception {
		snmptrap addresource = new snmptrap();
		addresource.trapclass = resource.trapclass;
		addresource.trapdestination = resource.trapdestination;
		addresource.version = resource.version;
		addresource.destport = resource.destport;
		addresource.communityname = resource.communityname;
		addresource.srcip = resource.srcip;
		addresource.severity = resource.severity;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add snmptrap resources.
	*/
	public static base_responses add(nitro_service client, snmptrap resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmptrap addresources[] = new snmptrap[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new snmptrap();
				addresources[i].trapclass = resources[i].trapclass;
				addresources[i].trapdestination = resources[i].trapdestination;
				addresources[i].version = resources[i].version;
				addresources[i].destport = resources[i].destport;
				addresources[i].communityname = resources[i].communityname;
				addresources[i].srcip = resources[i].srcip;
				addresources[i].severity = resources[i].severity;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmptrap of given name.
	*/
	public static base_response delete(nitro_service client, String trapclass) throws Exception {
		snmptrap deleteresource = new snmptrap();
		deleteresource.trapclass = trapclass;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmptrap.
	*/
	public static base_response delete(nitro_service client, snmptrap resource) throws Exception {
		snmptrap deleteresource = new snmptrap();
		deleteresource.trapclass = resource.trapclass;
		deleteresource.trapdestination = resource.trapdestination;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete snmptrap resources of given names.
	*/
	public static base_responses delete(nitro_service client, String trapclass[]) throws Exception {
		base_responses result = null;
		if (trapclass != null && trapclass.length > 0) {
			snmptrap deleteresources[] = new snmptrap[trapclass.length];
			for (int i=0;i<trapclass.length;i++){
				deleteresources[i] = new snmptrap();
				deleteresources[i].trapclass = trapclass[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete snmptrap resources.
	*/
	public static base_responses delete(nitro_service client, snmptrap resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmptrap deleteresources[] = new snmptrap[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new snmptrap();
				deleteresources[i].trapclass = resources[i].trapclass;
				deleteresources[i].trapdestination = resources[i].trapdestination;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update snmptrap.
	*/
	public static base_response update(nitro_service client, snmptrap resource) throws Exception {
		snmptrap updateresource = new snmptrap();
		updateresource.trapclass = resource.trapclass;
		updateresource.trapdestination = resource.trapdestination;
		updateresource.destport = resource.destport;
		updateresource.version = resource.version;
		updateresource.communityname = resource.communityname;
		updateresource.srcip = resource.srcip;
		updateresource.severity = resource.severity;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update snmptrap resources.
	*/
	public static base_responses update(nitro_service client, snmptrap resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmptrap updateresources[] = new snmptrap[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new snmptrap();
				updateresources[i].trapclass = resources[i].trapclass;
				updateresources[i].trapdestination = resources[i].trapdestination;
				updateresources[i].destport = resources[i].destport;
				updateresources[i].version = resources[i].version;
				updateresources[i].communityname = resources[i].communityname;
				updateresources[i].srcip = resources[i].srcip;
				updateresources[i].severity = resources[i].severity;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of snmptrap resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String trapclass, String args[]) throws Exception {
		snmptrap unsetresource = new snmptrap();
		unsetresource.trapclass = trapclass;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of snmptrap resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, snmptrap resource, String[] args) throws Exception{
		snmptrap unsetresource = new snmptrap();
		unsetresource.trapclass = resource.trapclass;
		unsetresource.trapdestination = resource.trapdestination;
		unsetresource.destport = resource.destport;
		unsetresource.version = resource.version;
		unsetresource.communityname = resource.communityname;
		unsetresource.srcip = resource.srcip;
		unsetresource.severity = resource.severity;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of snmptrap resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String trapclass[], String args[]) throws Exception {
		base_responses result = null;
		if (trapclass != null && trapclass.length > 0) {
			snmptrap unsetresources[] = new snmptrap[trapclass.length];
			for (int i=0;i<trapclass.length;i++){
				unsetresources[i] = new snmptrap();
				unsetresources[i].trapclass = trapclass[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of snmptrap resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, snmptrap resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			snmptrap unsetresources[] = new snmptrap[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new snmptrap();
				unsetresources[i].trapclass = resources[i].trapclass;
				unsetresources[i].trapdestination = resources[i].trapdestination;
				unsetresources[i].destport = resources[i].destport;
				unsetresources[i].version = resources[i].version;
				unsetresources[i].communityname = resources[i].communityname;
				unsetresources[i].srcip = resources[i].srcip;
				unsetresources[i].severity = resources[i].severity;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the snmptrap resources that are configured on netscaler.
	*/
	public static snmptrap[] get(nitro_service service) throws Exception{
		snmptrap obj = new snmptrap();
		snmptrap[] response = (snmptrap[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the snmptrap resources that are configured on netscaler.
	*/
	public static snmptrap[] get(nitro_service service, options option) throws Exception{
		snmptrap obj = new snmptrap();
		snmptrap[] response = (snmptrap[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a snmptrap resource.
	*/
	public static snmptrap get(nitro_service service, snmptrap obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		snmptrap response = (snmptrap) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a snmptrap resources.
	*/
	public static snmptrap[] get(nitro_service service, snmptrap obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			snmptrap response[] = new snmptrap[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (snmptrap) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of snmptrap resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static snmptrap[] get_filtered(nitro_service service, String filter) throws Exception{
		snmptrap obj = new snmptrap();
		options option = new options();
		option.set_filter(filter);
		snmptrap[] response = (snmptrap[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmptrap resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmptrap[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmptrap obj = new snmptrap();
		options option = new options();
		option.set_filter(filter);
		snmptrap[] response = (snmptrap[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmptrap resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		snmptrap obj = new snmptrap();
		options option = new options();
		option.set_count(true);
		snmptrap[] response = (snmptrap[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of snmptrap resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		snmptrap obj = new snmptrap();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmptrap[] response = (snmptrap[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmptrap resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		snmptrap obj = new snmptrap();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		snmptrap[] response = (snmptrap[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class trapclassEnum {
		public static final String generic = "generic";
		public static final String specific = "specific";
	}
	public static class severityEnum {
		public static final String Critical = "Critical";
		public static final String Major = "Major";
		public static final String Minor = "Minor";
		public static final String Warning = "Warning";
		public static final String Informational = "Informational";
	}
	public static class versionEnum {
		public static final String V1 = "V1";
		public static final String V2 = "V2";
	}
}
